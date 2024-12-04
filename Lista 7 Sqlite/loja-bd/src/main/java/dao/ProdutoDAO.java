package dao;

import model.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    public void criarTabela() {
        try (Connection connection = Conexao.getConnection();
                Statement statement = connection.createStatement()) {
            String createTableSQL = """
                    -- Criação da tabela Produto
                    CREATE TABLE IF NOT EXISTS Produto (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        id_fornecedor INTEGER NOT NULL,
                        nome TEXT NOT NULL,
                        preco REAL NOT NULL,
                        validade DATE NOT NULL,
                        FOREIGN KEY (id_fornecedor) REFERENCES Fornecedor(id)
                    );
                """;
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            System.err.println("Erro na comunicação com o banco de dados!");
            e.printStackTrace();
        }
    }

    public void inserir(Produto produto) {
        String sql = "INSERT INTO Produto (id_fornecedor, nome, preco, validade) VALUES (?, ?, ?, ?)";

        try (Connection connection = Conexao.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, produto.getIdFornecedor());
            preparedStatement.setString(2, produto.getNome());
            preparedStatement.setDouble(3, produto.getPreco());
            preparedStatement.setDate(4, produto.getValidade());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir produto.", e);
        }
    }

    public List<Produto> listar() {
        String sql = "SELECT * FROM Produto";
        List<Produto> produtos = new ArrayList<Produto>();

        try (Connection connection = Conexao.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                Produto produto = new Produto();
                produto.setId(resultSet.getInt("id"));
                produto.setIdFornecedor(resultSet.getInt("id_fornecedor"));
                produto.setNome(resultSet.getString("nome"));
                produto.setPreco(resultSet.getDouble("preco"));
                produto.setValidade(resultSet.getDate("validade"));

                produtos.add(produto);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar produtos.", e);
        }

        return produtos;
    }

    public void atualizar(Produto produto) {
        String sql = "UPDATE Produto SET nome = ?, preco = ?, validade = ? WHERE id = ?";

        try (Connection connection = Conexao.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setDouble(2, produto.getPreco());
            preparedStatement.setDate(3, produto.getValidade());
            preparedStatement.setInt(4, produto.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar o produto.", e);
        }
    }
    public void deletar(Produto produto) {
    	String deleteSQL = "DELETE FROM Produto WHERE id = ?";

        try (Connection connection = Conexao.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {

            preparedStatement.setInt(3, produto.getId());
           

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar o produto.", e);
        }
    }
}
