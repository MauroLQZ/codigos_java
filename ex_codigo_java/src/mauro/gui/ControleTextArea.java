package mauro.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame implements ActionListener{
	
	JTextArea texto;
	
	public ControleTextArea(){
		super("Editor de Texto");
		
		texto = new JTextArea();
		//Cria uma barra de rolagem
		JScrollPane scroll = new JScrollPane(texto);
		texto.setFont(new Font("Serif", Font.PLAIN, 26));
		
		//Botao ao ser clicado abre um arquivo
		JButton botao = new JButton("Abrir Arquivo");
		botao.setFont(new Font("Serif", Font.PLAIN, 26));
		botao.addActionListener(this);//this add o objeto atual no evento
		
		Container c = getContentPane();
		//ao inves de colocar o texto colocamos o scroll
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.SOUTH, botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//metodo vai recuperar o arq e apresentar no editor de texo
		JFileChooser c = new JFileChooser();
		c.showOpenDialog(this);
		//recupera um arquivo 
		File file = c.getSelectedFile();
		try{
			//Pega o caminho do arquivo p mostrar com o endereco absoluto do arq como parametro
			Path path = Paths.get(file.getAbsolutePath());
	        //le todos os bytes com a classe File
			Files.readAllBytes(path);
			//convertendo um array de bytes em string p colocar ele dentro do editor de texto
	        String retorno = new String(Files.readAllBytes(path));
		    //assessamos o editor de texto dentro do actionperformed e definir o texto desse editor
		    //retorna da leitura q fizemos aki
	        texto.setText(retorno);
		}catch (Exception erro){
			JOptionPane.showMessageDialog(this, "Não foi possivel carregar seu arquivo!");
		}
		
		
	}

	public static void main(String[] args) {
		new ControleTextArea();

	}

}
