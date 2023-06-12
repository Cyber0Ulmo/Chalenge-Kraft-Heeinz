package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConexaoDB;
import model.Acao;


public class AcaoDAO {
	
	

	public void inserirAcao(Acao acao) {
        try (Connection conexao = ConexaoDB.getConnection();
             PreparedStatement statement = conexao.prepareStatement(
                     "INSERT INTO t_acao (t_fabrica_cd_idfabrica, cd_acao, qt_acucar, qt_refeicao) VALUES (?, ?, ?, ?)")) {
            statement.setString(1, acao.getFabricaCdIdFabrica());
            statement.setString(2, acao.getCdAcao());
            statement.setInt(3, acao.getQtAcucar());
            statement.setInt(4, acao.getQtRefeicao());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


	

}
