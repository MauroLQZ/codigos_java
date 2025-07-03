package arquivos2;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

//public class TableDisplay extends JFrame {
public class Codigo_BancoDados extends JFrame{	
	
	private static final long serialVersionUID = 1L;
	private Connection connection;
	private JTable jTable;
		
	public void TableDisplay() throws ClassNotFoundException, SQLException {
	//public Codigo_BancoDados {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:ORADB";
		String username = "target";
		String password = "target";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, username, password);
			connection.setAutoCommit(false);
			
		    getTable();
		
		    setTitle("Oracle Connection");
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setSize(650, 400);
		    setVisible(true);	
	    //}catch() {
	    	
	    } finally {
		}
	}

	private void displayResultSet(ResultSet rs) throws SQLException {
	
		boolean moreRecords = rs.next();
		
		if (!moreRecords) {
			JOptionPane.showMessageDialog(this, "ResultSet não continha registros");
			return;
		}
		Vector columnHeads = new Vector();
		
		Vector rows = new Vector();
		
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			
			for (int i = 1; i <= rsmd.getColumnCount(); ++i)
				
				columnHeads.addElement(rsmd.getColumnName(i));
			do {
				
				rows.addElement(getNextRow(rs, rsmd));
			} while (rs.next());
			
			jTable = new JTable(rows, columnHeads);
			
			JScrollPane scroller = new JScrollPane(jTable);
			getContentPane().add(scroller, BorderLayout.CENTER);
			validate();
		}finally {
			
		}
	}
	private Vector getNextRow(ResultSet rs, ResultSetMetaData rsmd) throws SQLException {
		
		Vector currentRow = new Vector();
		
		for (int i = 1; i <= rsmd.getColumnCount(); ++i)
			
			switch (rsmd.getColumnType(i)) {
				
			case Types.VARCHAR:
				currentRow.addElement(rs.getString(i));
				break;
			case Types.INTEGER:
				currentRow.addElement(new Long(rs.getLong(i)));
				break;
			case Types.DATE:
				currentRow.addElement(rs.getString(i));
				break;
			default:
				currentRow.addElement(rs.getString(i));
			}
		return currentRow;
	}
	
	private void getTable() throws SQLException {
		
		Statement statement = null;
		
		ResultSet resultSet = null;
		
		try {
			String query = "SELECT * FROM Emp";
			
			statement = connection.createStatement();
			
			resultSet = statement.executeQuery(query);
			
			displayResultSet(resultSet);
		}finally {
			
		}
	}

	public static void main(String args[]) {
		//final TableDisplay app = new TableDisplay();
		Codigo_BancoDados app = new Codigo_BancoDados();
	}

	public void shutDown() {
		try {
			connection.close();
		} catch (SQLException sqlex) {
			System.err.println("Unable to disconnect");
			sqlex.printStackTrace();
		}
	}
}