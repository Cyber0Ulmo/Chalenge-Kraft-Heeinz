package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConexaoDB;
import model.Fabrica;

public class FabricaDAO {

    public void inserirFabrica(Fabrica fabrica) {
        try (Connection conexao = ConexaoDB.getConnection();
             PreparedStatement statement = conexao.prepareStatement(
                     "INSERT INTO t_fabrica (cd_idfabrica, ds_local) VALUES (?, ?)")) {
            statement.setString(1, fabrica.getCdIdFabrica());
            statement.setString(2, fabrica.getDsLocal());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

