package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConexaoDB;
import model.Produto;

public class ProdutoDAO {

    public void inserirProduto(Produto produto) {
        try (Connection conexao = ConexaoDB.getConnection();
             PreparedStatement statement = conexao.prepareStatement(
                     "INSERT INTO t_produto (cd_idproduto, ds_produto, ds_composicao, qt_agua, qt_energia, t_fabrica_cd_idfabrica, ds_dtprodi) VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            statement.setString(1, produto.getCdIdProduto());
            statement.setString(2, produto.getDsProduto());
            statement.setString(3, produto.getDsComposicao());
            statement.setInt(4, produto.getQtAgua());
            statement.setInt(5, produto.getQtEnergia());
            statement.setString(6, produto.getFabricaCdIdFabrica());
            statement.setString(7, produto.getDsDtProdi());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


