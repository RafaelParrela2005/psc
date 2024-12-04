package carros;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private Connection connection = null;
	
	//Construtor
	public ConnectionFactory() {}
	
	
	//Método para a conexão com o banco de dados
	public Connection createConnection() {
		try {
			this.connection = DriverManager.getConnection("jdbc:sqlite:teste.db");
            System.out.println("Conexão com SQLite estabelecida!");
		}catch(Exception e){
			System.err.println("Não foi possível estabelecer conexão com SQLite!");
            e.printStackTrace();
		}
		return this.connection;
	}
	
	
}
