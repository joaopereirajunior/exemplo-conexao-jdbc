package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.caelum.jdbc.exceptions.ConexaoNegadaException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root","admin123");
		} catch (SQLException e) {
			throw new ConexaoNegadaException("Falha ao se conectar ao bd");
		}
	}

}

