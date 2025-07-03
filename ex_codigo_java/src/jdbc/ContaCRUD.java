package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaCRUD {

	public void transferir(Connection con, Conta origem, Conta destino,
			double valor) throws SQLException {
		if (origem.saldo >= valor) {

			/*
			 * definir q a conexao nao sera auto comutada vai tratar as
			 * operacoes em conjunto, espera a excucao positiva para fazer a
			 * transacao
			 */
			try {
				con.setAutoCommit(false);
				/* SAQUE */
				origem.saldo -= valor;
				alterar(con, origem);
				
				/* Se acontecer algum erro ele nao finaliza a operacao
				 * exemplo abaixo q no final nao vai executar a operacao
				 * int x = 1/0;
				 * */
				
				/* DEPOSITO */
				destino.saldo += valor;
				alterar(con, destino);
				/* CONFIRMA CONEXAO E TRANSACAO */
				con.commit();
			} catch (Exception e) {
				/*
				 * se acontecer algum problema desfaz a transacao
				 */
				con.rollback();
			}
		}

	}

	public void criar(Connection con, Conta conta) throws SQLException {
		String sql = "insert into conta values (?, ?, ? )";

		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setInt(1, conta.numero);
			stm.setString(2, conta.cliente);
			stm.setDouble(3, conta.saldo);
			stm.executeUpdate();
		}
	}

	public List<Conta> ler(Connection con) throws SQLException {
		List<Conta> lista = new ArrayList<>();
		String sql = "select numero,cliente,saldo from conta";
		try (PreparedStatement stm = con.prepareStatement(sql);
				ResultSet rs = stm.executeQuery()) {
			while (rs.next()) {
				lista.add(new Conta(rs.getInt(1), rs.getString(2), rs
						.getDouble(3)));
			}
		}
		return lista;
	}

	public void alterar(Connection con, Conta conta) throws SQLException {
		String sql = "update conta set cliente=?, saldo=? where numero=?";

		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setString(1, conta.cliente);
			stm.setDouble(2, conta.saldo);
			stm.setInt(3, conta.numero);
			stm.executeUpdate();
		}
	}

	public void excluir(Connection con, Conta conta) throws SQLException {
		String sql = "delete conta where numero=?";

		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setInt(1, conta.numero);
			stm.executeUpdate();
		}
	}

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try (Connection con = DriverManager.getConnection(url, "Mauro",
				"Mauro123")) {
			ContaCRUD crud = new ContaCRUD();
					
			List<Conta> contas = crud.ler(con); 
			  for (Conta conta : contas) {
			       System.out.println(conta); 
			  }
			  /*RECUPERAR AS CONTAS Q TEM NO BANCO */
			  
			  Conta origem = contas.get(0);
			  Conta destino = contas.get(1);
			  crud.transferir(con, origem, destino, 500);
			  
			  contas = crud.ler(con); 
			  for (Conta conta : contas) {
			       System.out.println(conta); 
			  }
			/*
			 * Conta conta2 = new Conta(2, "Pablo", 5555.00);
			 * 
			 * crud.criar(con, conta1); crud.criar(con, conta2); crud.criar(con,
			 * conta3);
			 * 
			 * List<Conta> contas = crud.ler(con); 
			 * for (Conta conta : contas) {
			 * System.out.println(conta); 
			 * Conta conta1 = new Conta(1, "Mauro", 1000.00);
			conta1.saldo = 9000.99;
			crud.alterar(con, conta1);
			System.out.println(conta1);

			Conta conta3 = new Conta(3, "Lucca", 2233.00);
			crud.excluir(con, conta3);
			 * }
			 */

		}
	}

}
