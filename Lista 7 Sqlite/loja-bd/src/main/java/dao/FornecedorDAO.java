package dao;

import model.Fornecedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO {
    public void criarTabela() {
        try (Connection connection = Conexao.getConnection();
                Statement statement = connection.createStatement()) {
            String createTableSQL = """
                    -- Criação da tabela Fornecedor
                    CREATE TABLE IF NOT EXISTS Fornecedor (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        nome TEXT NOT NULL,
                        telefone TEXT NOT NULL,
                        endereco TEXT NOT NULL
                    );
                """;
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            System.err.println("Erro na comunicação com o banco de dados!");
            e.printStackTrace();
        }
    }

    public void inserir(Fornecedor fornecedor) {
        String sql = "INSERT INTO Fornecedor (nome, telefone, endereco) VALUES (?, ?, ?)";

        try (Connection connection = Conexao.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, fornecedor.getNome());
            preparedStatement.setString(2, fornecedor.getTelefone());
            preparedStatement.setString(3, fornecedor.getEndereco());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir fornecedor.", e);
        }
    }

    public List<Fornecedor> listar() {
        String sql = "SELECT * FROM Fornecedor";
        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

        try (Connection connection = Conexao.getConnection();
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(sql)) {

            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setEndereco(rs.getString("endereco"));

                fornecedores.add(fornecedor);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar fornecedores.", e);
        }

        return fornecedores;
    }

    public void atualizar(Fornecedor fornecedor) {
        String sql = "UPDATE Fornecedor SET nome = ?, telefone = ?, endereco = ? WHERE id = ?";

        try (Connection connection = Conexao.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, fornecedor.getNome());
            preparedStatement.setString(2, fornecedor.getTelefone());
            preparedStatement.setString(3, fornecedor.getEndereco());
            preparedStatement.setInt(4, fornecedor.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar o fornecedor.", e);
        }
    }
    public void deletar(Fornecedor fornecedor) {
    	String deleteSQL = "DELETE FROM Fornecedor WHERE id = ?";

        try (Connection connection = Conexao.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {

            preparedStatement.setInt(3, fornecedor.getId());
           

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar o fornecedor.", e);
        }
    }
}
