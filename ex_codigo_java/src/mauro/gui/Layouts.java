package mauro.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Layouts extends JFrame{
	
	public Layouts(){
		
		super("Layouts");	
		/* Container c = getContentPane();
		//CRIANDO SEU PROPRIO BORDERLAYOUT
		BorderLayout border = new BorderLayout();
		c.setLayout(border);
		//Layout usando o borderLayout definindo regioes
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));
		c.add(BorderLayout.CENTER, new JButton("3"));
		c.add(BorderLayout.EAST, new JButton("4"));
		c.add(BorderLayout.WEST, new JButton("5"));
		*/
		//getContentPane().add(new JButton("1"));
		//getContentPane().add(new JButton("1"));
		
		//Layout mais simples FlowLayout
		//Nao  precisa definir a localizacao dos elemento ele define p ordem de chegada
				
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JTextField("Aqui termina o que comecou!!!"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		
        new Layouts();
	}

}
