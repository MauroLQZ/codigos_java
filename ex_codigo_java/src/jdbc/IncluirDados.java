package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncluirDados {

	public static void main(String[] args) throws SQLException {

		/*
		 * Exemplo de registro p uma pessoa String sql =
		 * "insert into pessoa values (3, 'Caio', 'M', 'caio@java.com.br' )";
		 * String url = "jdbc:oracle:thin:@localhost:1521:xe"; try( Connection
		 * con = DriverManager.getConnection(url, "Mauro","Mauro123");
		 * PreparedStatement stm = con.prepareStatement(sql)) {
		 * stm.executeUpdate();
		 */

		String sql = "insert into pessoa values (?, ?, ?, ? )";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String[] pessoas = { "Sandra", "Beatriz", "Juliana", "Maria", "Leila",
				"Pedro" };

		try (Connection con = DriverManager.getConnection(url, "Mauro",
				"Mauro123")) {
			try (PreparedStatement stm = con.prepareStatement(sql)) {
				for (int i = 0; i < pessoas.length; i++) {
					stm.setInt(1, i + 4);
					stm.setString(2, pessoas[i]);
					stm.setString(3, "F");
					stm.setString(4, pessoas[i].toLowerCase() + "@java.com.br");
					// inclui varios registros de uma unica vez incluimos essas
					// requisicoes
					// em um conjunto de requisicoes numa unica vez
					stm.addBatch();

				}
				stm.executeBatch();
			} catch (SQLException e) {}
			
			sql = "select nome, email from pessoa ";
			try(PreparedStatement stm2 = con.prepareStatement(sql)) {
			   ResultSet rs = stm2.executeQuery();
			     while (rs.next()) {
			    	 System.out.println(rs.getString(1) + rs.getString(2));
			     }
			}
		}

	}
}
