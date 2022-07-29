package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.exceptions.ConexaoNegadaException;

public class TestaConexao {

	public static void main(String[] args) {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			connection.close();
			System.out.println("A conexao foi aberta");
		} catch (ConexaoNegadaException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
