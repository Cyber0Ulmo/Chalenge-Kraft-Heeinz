package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConexaoDB;
import model.Inftostkhld;

public class InftostkhldDAO {

    public void inserirInftostkhld(Inftostkhld inftostkhld) {
        try (Connection conexao = ConexaoDB.getConnection();
             PreparedStatement statement = conexao.prepareStatement(
                     "INSERT INTO t_inftostkhld (t_fabrica_cd_idfabrica, ds_report) VALUES (?, ?)")) {
            statement.setString(1, inftostkhld.getFabricaCdIdFabrica());
            statement.setString(2, inftostkhld.getDsReport());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

