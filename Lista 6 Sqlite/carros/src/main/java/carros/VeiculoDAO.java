package carros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VeiculoDAO {
	
	public void createTable() {
		Connection connection = null;
        Statement statement = null;
        try {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connection = connectionFactory.createConnection();

            // Criar um statement baseado em uma string SQL:
            String createTableSQL = """
                      CREATE TABLE veiculos (
            		    marca VARCHAR(100) NOT NULL,       
					    modelo VARCHAR(100) NOT NULL,      
					    chassi VARCHAR(50) UNIQUE NOT NULL, 
					    placa VARCHAR(20) UNIQUE NOT NULL,
					    cor VARCHAR(50) NOT NULL           
            		        		);
                    """;
            statement = connection.createStatement();
            statement.execute(createTableSQL);
            System.out.println("Tabela 'veiculos' criada já existe!");
        } catch(SQLException e){
        	 System.err.println("Erro na comunicação com o banco de dados!");
             e.printStackTrace();
        }finally {
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}
	
	//Comand para INSERIR , criar uma novo veículo
	public Veiculo create(Veiculo veiculo) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Utilizar a fábrica de conexões para criar uma Connection SQL:
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connection = connectionFactory.createConnection();

            // Criar um preparedStatement baseado em uma string SQL:
            String insertSQL = "INSERT INTO veiculo (marca, modelo, chassi, placa, cor) values (?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertSQL);

            // Preencher os valores no PreparedStatement:
            preparedStatement.setString(1, veiculo.getMarca());
            preparedStatement.setString(2, veiculo.getModelo());
            preparedStatement.setString(3, veiculo.getChassi());
            preparedStatement.setString(2, veiculo.getPlaca());
            preparedStatement.setString(2, veiculo.getCor());
            // Executar o comando SQL:
            preparedStatement.execute();
           

            System.out.println(
                    "Veículo GRAVADO NO BANCO DE DADOS: " +
                            "\nMARCA: " + veiculo.getMarca() +
                            "\nMODELO: " + veiculo.getModelo() +
                            "\nCHASSI: " + veiculo.getChassi() +
                            "\nPLACA: " + veiculo.getPlaca() +
                            "\nCOR: " + veiculo.getCor()
                            );
        } catch (SQLException e) {
            System.err.println("Erro na comunicação com o banco de dados!");
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return veiculo;
    }
	//Método de consulta pela placa
	 public Veiculo read(String placa) {
	        Veiculo veiculo = null;
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;

	        try {
	            // Utilizar a fábrica de conexões para criar uma Connection SQL:
	            ConnectionFactory connectionFactory = new ConnectionFactory();
	            connection = connectionFactory.createConnection();

	            // Criar um preparedStatement baseado em uma string SQL:
	            String selectSQL = "SELECT * FROM veiculo WHERE placa = ?";
	            preparedStatement = connection.prepareStatement(selectSQL);

	            // Preencher o valor do identificador no PreparedStatement:
	            preparedStatement.setString(1, placa);

	            // Executar o comando SQL:
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                veiculo = new Veiculo();
	                veiculo.setMarca(resultSet.getString("marca"));
	                veiculo.setModelo(resultSet.getString("modelo"));
	                veiculo.setChassi(resultSet.getString("chassi"));
	                veiculo.setPlaca(resultSet.getString("Placa"));
	                veiculo.setCor(resultSet.getString("cor"));
	                System.out.println(
	                		"\nMARCA: " + veiculo.getMarca() +
                            "\nMODELO: " + veiculo.getModelo() +
                            "\nCHASSI: " + veiculo.getChassi() +
                            "\nPLACA: " + veiculo.getPlaca() +
                            "\nCOR: " + veiculo.getCor());
	            } else {
	                System.out.println("Veículo não encontrado!");
	            }
	        } catch (SQLException e) {
	            System.err.println("Erro na comunicação com o banco de dados!");
	            e.printStackTrace();
	        } finally {
	            try {
	                if (resultSet != null)
	                    resultSet.close();
	                if (preparedStatement != null)
	                    preparedStatement.close();
	                if (connection != null)
	                    connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        return veiculo;
	    }
	 
	 
	 //Metodos para atualizar os dados a partir da placa registrada
	 public void update(Veiculo veiculo) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            // Utilizar a fábrica de conexões para criar uma Connection SQL:
	            ConnectionFactory connectionFactory = new ConnectionFactory();
	            connection = connectionFactory.createConnection();

	            // Criar um preparedStatement baseado em uma string SQL:
	            String updateSQL = "UPDATE veiculo SET marca = ?, modelo = ?, chassi = ?, cor = ? WHERE placa = ?";
	            preparedStatement = connection.prepareStatement(updateSQL);

	            // Preencher os valores no PreparedStatement:
	            preparedStatement.setString(1, veiculo.getMarca());
	            preparedStatement.setString(2, veiculo.getModelo());
	            preparedStatement.setString(3, veiculo.getChassi());
	            preparedStatement.setString(4, veiculo.getCor());
	            preparedStatement.setString(5, veiculo.getPlaca());

	            // Executar o comando SQL:
	            preparedStatement.executeUpdate();

	            System.out.println("O veículo " + veiculo.getPlaca() + " foi atualizado no banco de dados!");
	        } catch (SQLException e) {
	            System.err.println("Erro na comunicação com o banco de dados!");
	            e.printStackTrace();
	        } finally {
	            try {
	                if (preparedStatement != null)
	                    preparedStatement.close();
	                if (connection != null)
	                    connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	 
	 //Metodo para deletar a partir da placa 
	 public void delete(Veiculo veiculo) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            // Utilizar a fábrica de conexões para criar uma Connection SQL:
	            ConnectionFactory connectionFactory = new ConnectionFactory();
	            connection = connectionFactory.createConnection();

	            // Criar um preparedStatement baseado em uma string SQL:
	            String deleteSQL = "DELETE FROM veiculo WHERE placa = ?";
	            preparedStatement = connection.prepareStatement(deleteSQL);

	            // Preencher os valores no PreparedStatement:
	            preparedStatement.setString(1, veiculo.getPlaca());

	            // Executar o comando SQL:
	            preparedStatement.execute();

	            System.out.println("O veiculo " + veiculo.getPlaca() + " foi removido do BD.");
	        } catch (SQLException e) {
	            System.err.println("Erro na comunicação com o banco de dados!");
	            e.printStackTrace();
	        } finally {
	            try {
	                if (preparedStatement != null)
	                    preparedStatement.close();
	                if (connection != null)
	                    connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
