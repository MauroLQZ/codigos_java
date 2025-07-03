package redes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatCliente extends JFrame {

	JTextField textoParaEnviar;
	Socket socket;
	PrintWriter escritor;
	String nome;
	JTextArea textoRecebido;
	Scanner leitor;


	private class EscutaServidor implements Runnable {

		@Override
		public void run() {
			try {
				String texto;
				while ((texto = leitor.nextLine()) != null) {
					// metodo append add no final do texto esse novo texto
					textoRecebido.append(texto + "\n");
				}
			} catch (Exception e) {
			}
		}
	}

	
	public ChatCliente(String nome) {
		super("Chat : " + nome);
		this.nome = nome;

		Font fonte = new Font("Serif", Font.PLAIN, 26);
		textoParaEnviar = new JTextField();
		textoParaEnviar.setFont(fonte);
		JButton botao = new JButton("Enviar");
		botao.setFont(fonte);
		// definir uma classe q escuta os cliks dos botao e acionar
		// o envio das msg dentro do campo texto p o servidor
		botao.addActionListener(new EnviarListener());

		Container envio = new JPanel();
		envio.setLayout(new BorderLayout());
		envio.add(BorderLayout.CENTER, textoParaEnviar);
		envio.add(BorderLayout.EAST, botao);
		
		configurarRede();
		
		textoRecebido = new JTextArea();
		textoRecebido.setFont(fonte);
		JScrollPane scroll = new JScrollPane(textoRecebido);
		
		// add o container
		getContentPane().add(BorderLayout.CENTER, scroll);
		getContentPane().add(BorderLayout.SOUTH, envio);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 500);

	}

	private class EnviarListener implements ActionListener {

		@Override
		// este metodo e responsavel p enviar as msg p o servidor.
		public void actionPerformed(ActionEvent e) {
			
			//System.out.println(nome + " : " +textoParaEnviar.getText());
            escritor.println(nome + " : " +textoParaEnviar.getText());
			// garantir q informacao foi encaminhada com sucesso
			escritor.flush();
			// limpar o campo p inserir nova msg
			textoParaEnviar.setText("");
			// coloca o cursor novamente neste campo
			textoParaEnviar.requestFocus();
		}
	}

	private void configurarRede() {
		try {
			socket = new Socket("127.0.0.1", 5000);
			escritor = new PrintWriter(socket.getOutputStream());
			leitor = new Scanner(socket.getInputStream());
			new Thread(new EscutaServidor()).start();
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) throws IOException, Exception {
		new ChatCliente("Mauro");
		new ChatCliente("Mana");

	}

}
