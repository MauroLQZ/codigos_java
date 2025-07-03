package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AcessoBanco {

	public static void main(String[] args) throws Exception {

		// comando sql usado p preparedStatement
		String sql = "select codigo, nome, sexo, email from pessoa ";
		/*
		 * Definindo a url do banco p conexao. protocolo: jdbc/sub-protocolo:
		 * oracle:thin/end ip ou nome do servidor q queremos nos conectar:
		 * @localhost ou @127.0.0.1 porta tcp responde as requisicoes: 1521 nome
		 * do banco de dados: xe antigamente:
		 * Class.forName("oracle.jdbc.OracleDriver"); hoje o driver e descoberto
		 * automaticamente. executeQuery: executa uma consulta no bd
		 * executeUpdate: executa uma alteracao no bd
		 */
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		// conexao: url, usuario de conexao, senha usuario
		try (Connection con = DriverManager.getConnection(url, "Mauro",
				"Mauro123");
		// Objeto statement: encaminhar requisicoes pra o servidor
				PreparedStatement stm = con.prepareStatement(sql);
				// retorna objeto result set a lista de registro da tabela
				// pessoa
				ResultSet rs = stm.executeQuery()) {

			while (rs.next()) {
				//pode chamar a coluna ou posicao apartir do numero 1
				//ex: System.out.println(rs.getString(2));
				String s = rs.getString("codigo") 
						+ "; " + rs.getString("nome")
						+ "; " + rs.getString("sexo") 
						+ "; " + rs.getString("email");
				System.out.println(s);
			}
		}
		/*
		 * rs.close(); stm.close(); con.close();
		 */

	}

}
