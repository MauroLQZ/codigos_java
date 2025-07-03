package mauro.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JTextField resultado;
	
	/**
	 * Create the frame.
	 */
	public Conversor() {
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				    double fahrenheit = Double.parseDouble(valor.getText());
				    double celsius = (fahrenheit - 32) / 1.8;
			         resultado.setText(celsius + " °C ");
				} catch (Exception erro) {} 
			}
		});
		contentPane.add(btnConverter, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblFahreinheit = new JLabel("Fahrenheit:");
		lblFahreinheit.setHorizontalAlignment(SwingConstants.CENTER);
		lblFahreinheit.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblFahreinheit);
		
		valor = new JTextField();
		valor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(valor);
		valor.setColumns(10);
		
		JLabel lblCelcius = new JLabel("Celcius:");
		lblCelcius.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelcius.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblCelcius);
		
		resultado = new JTextField();
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(resultado);
		resultado.setColumns(10);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	}
	