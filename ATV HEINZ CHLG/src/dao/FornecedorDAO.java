package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConexaoDB;
import model.Fornecedor;

public class FornecedorDAO {

    public void inserirFornecedor(Fornecedor fornecedor) {
        try (Connection conexao = ConexaoDB.getConnection();
             PreparedStatement statement = conexao.prepareStatement(
                     "INSERT INTO t_fornecedor (cd_id, nm_ds, ds_cnpj, t_fabrica_cd_idfabrica) VALUES (?, ?, ?, ?)")) {
            statement.setString(1, fornecedor.getCdId());
            statement.setString(2, fornecedor.getNmDs());
            statement.setString(3, fornecedor.getDsCnpj());
            statement.setString(4, fornecedor.getFabricaCdIdFabrica());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

