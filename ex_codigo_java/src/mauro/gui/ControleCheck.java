package mauro.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame{
	
	JTextField texto;
	JCheckBox bold, italic;
	
	
	public ControleCheck(){
		super("Contole Check!");
		
		 texto = new JTextField("Veja a Fonte Mudar", 12);
		
		 //Formatando o texto
		texto.setFont(new Font("Serif", Font.PLAIN, 26));
		Container c = getContentPane();
		
		bold= new JCheckBox("Bold");
		//Definindo a escuta p esse evento listener
		bold.addItemListener(new CheckBoxListener());//recebe o objeto q implementa a interface listener
		
		italic= new JCheckBox("Italic");
		italic.addItemListener(new CheckBoxListener());
		
		//Criando um outro Layout pra colocar todos os elementos dentro do container
		c.setLayout(new FlowLayout());
		
		//Configurar o JCheckBox na interface
		//Mudando a font do jtextfield
		//ao inves de c.add(new JTextField());
		c.add(texto);
		c.add(bold);
		c.add(italic);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 300);
	}
	
	class CheckBoxListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (bold.isSelected() && italic.isSelected()) {
					texto.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 26));		
			} else if (bold.isSelected() ) {
				texto.setFont(new Font("Serif", Font.BOLD, 26));	
			} else if (italic.isSelected() ) {
				texto.setFont(new Font("Serif", Font.ITALIC, 26));
			} else {
				texto.setFont(new Font("Serif", Font.PLAIN, 26));
			}
		}
		
	}

	public static void main(String[] args) {
		new ControleCheck();

	}

}
