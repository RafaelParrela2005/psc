package dao;

import model.Estoque;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class EstoqueDAO {
    public void criarTabela() {
        try (Connection connection = Conexao.getConnection();
                Statement statement = connection.createStatement()) {
            String createTableSQL = """
                    -- Criação da tabela Estoque
                    CREATE TABLE IF NOT EXISTS Estoque (
                        id_produto INTEGER NOT NULL,
                        cnpj_filial TEXT NOT NULL,
                        quantidade INTEGER NOT NULL,
                        PRIMARY KEY (id_produto, cnpj_filial),
                        FOREIGN KEY (id_produto) REFERENCES Produto(id),
                        FOREIGN KEY (cnpj_filial) REFERENCES Filial(cnpj)
                    );
                """;
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            System.err.println("Erro na comunicação com o banco de dados!");
            e.printStackTrace();
        }
    }

    public void inserir(Estoque estoque) {
        String sql = "INSERT INTO Estoque (id_produto, cnpj_filial, quantidade) VALUES (?, ?, ?)";

        try (Connection connection = Conexao.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, estoque.getIdProduto());
            preparedStatement.setString(2, estoque.getCnpjFilial());
            preparedStatement.setInt(3, estoque.getQuantidade());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir estoque.", e);
        }
    }

    public List<Estoque> listar() {
        String sql = "SELECT * FROM Estoque";
        List<Estoque> estoques = new ArrayList<>();

        try (Connection connection = Conexao.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                Estoque estoque = new Estoque();
                estoque.setIdProduto(resultSet.getInt("id_produto"));
                estoque.setCnpjFilial(resultSet.getString("cnpj_filial"));
                estoque.setQuantidade(resultSet.getInt("quantidade"));

                estoques.add(estoque);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar estoques.", e);
        }

        return estoques;
    }
    
    public void atualizar(Estoque estoque) {
        String sql = "UPDATE Estoque SET cnpj_filial = ?, quantidade = ? WHERE id_produto = ?";

        try (Connection connection = Conexao.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(3, estoque.getIdProduto());
            preparedStatement.setString(1, estoque.getCnpjFilial());
            preparedStatement.setInt(2, estoque.getQuantidade());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar o estoque.", e);
        }
    }
    public void deletar(Estoque estoque) {
    	String deleteSQL = "DELETE FROM Estoque WHERE id_produto = ?";

        try (Connection connection = Conexao.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {

            preparedStatement.setInt(3, estoque.getIdProduto());
           

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar o estoque.", e);
        }
    }
    
    
}
