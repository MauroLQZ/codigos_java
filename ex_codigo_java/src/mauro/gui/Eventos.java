package mauro.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener{
	
	JButton botao;
	public Eventos(){
		super("Eventos");
		
		botao = new JButton("Clique Aqui");
		//Informar p o botao alguem q consiga entender os eventos q ele vai lançar
		botao.addActionListener(this);//metodo q pega os tipos de evento q o botao trabalha
		getContentPane().add(botao);//add botao ao container pricipal da janela
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	 public void actionPerformed(ActionEvent e){
		 //System.out.println("Clicou");
		 botao.setText("FOI CLICADO!");
	 }
	 
	public static void main(String[] args) {
        new Eventos();
	}

}
