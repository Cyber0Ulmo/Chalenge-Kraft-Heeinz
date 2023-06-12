package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConexaoDB;
import model.Insumo;

public class InsumoDAO {

    public void inserirInsumo(Insumo insumo) {
        try (Connection conexao = ConexaoDB.getConnection();
             PreparedStatement statement = conexao.prepareStatement(
                     "INSERT INTO t_insumo (cd_idinsumo, ds_insumo, qt_insumo, ds_dt, ds_metodo, cd_metodo, t_fornecedor_cd_id) VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            statement.setString(1, insumo.getCdIdInsumo());
            statement.setString(2, insumo.getDsInsumo());
            statement.setInt(3, insumo.getQtInsumo());
            statement.setString(4, insumo.getDsDt());
            statement.setString(5, insumo.getDsMetodo());
            statement.setInt(6, insumo.getCdMetodo());
            statement.setString(7, insumo.getFornecedorCdId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


