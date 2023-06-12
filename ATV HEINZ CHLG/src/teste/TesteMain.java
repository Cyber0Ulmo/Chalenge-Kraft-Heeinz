package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteMain {
	
	private static final String DB_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String DB_USER = "RM96398";
    private static final String DB_PASSWORD = "200423";

	public static void main(String[] args) {
		

		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            inserirFabrica(connection);
            inserirFornecedor(connection);
            inserirInsumo(connection);
            inserirProduto(connection);
            inserirAcao(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void inserirFabrica(Connection connection) throws SQLException {
        String sql = "INSERT INTO t_fabrica (cd_idfabrica, ds_local) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, "FAB001");
            statement.setString(2, "Local da Fábrica");

            statement.executeUpdate();
        }
    }

    private static void inserirFornecedor(Connection connection) throws SQLException {
        String sql = "INSERT INTO t_fornecedor (cd_id, nm_ds, ds_cnpj, t_fabrica_cd_idfabrica) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, "FOR001");
            statement.setString(2, "Nome do Fornecedor");
            statement.setString(3, "CNPJ do Fornecedor");
            statement.setString(4, "FAB001");

            statement.executeUpdate();
        }
    }

    
    private static void inserirInsumo(Connection connection) throws SQLException {
        String sql = "INSERT INTO t_insumo (cd_idinsumo, ds_insumo, qt_insumo, ds_dt, ds_metodo, cd_metodo, t_fornecedor_cd_id) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, "INS001");
            statement.setString(2, "Nome do Insumo");
            statement.setInt(3, 100);
            statement.setString(4, "Data do Insumo");
            statement.setString(5, "Método do Insumo");
            statement.setInt(6, 1);
            statement.setString(7, "FOR001");

            statement.executeUpdate();
        }
    }

    private static void inserirProduto(Connection connection) throws SQLException {
        String sql = "INSERT INTO t_produto (cd_idproduto, ds_produto, ds_composicao, qt_agua, qt_energia, t_fabrica_cd_idfabrica, ds_dtprodi) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, "PRO001");
            statement.setString(2, "Nome do Produto");
            statement.setString(3, "Composição do Produto");
            statement.setInt(4, 50);
            statement.setInt(5, 200);
            statement.setString(6, "FAB001");
            statement.setString(7, "Data de Produção");

            statement.executeUpdate();
        }
    }

    private static void inserirAcao(Connection connection) throws SQLException {
        String sql = "INSERT INTO t_acao (t_fabrica_cd_idfabrica, cd_acao, qt_acucar, qt_refeicao) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, "FAB001");
            statement.setString(2, "ACAO001");
            statement.setNull(3, java.sql.Types.NUMERIC);
            statement.setNull(4, java.sql.Types.NUMERIC);

            statement.executeUpdate();
        }
    }
    
   
}
