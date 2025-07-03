package mauro.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame{
	
	public ControleLabel(){
		
		super("Controle Label");	
		//controle de label
		JLabel simples = new JLabel("Label Simples");
		simples.setToolTipText("Meu TooltipText");//qdo vc passa o mouse aparece o texto
		
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28);
		JLabel label = new JLabel("Label Simples");
		label.setFont(fonte);
		label.setForeground(Color.BLUE);//Define cores
		label.setToolTipText("Estou no label fonte!!!");
		
		//label com imagem
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/img.gif"));
		JLabel imagem = new JLabel(icon);
		imagem.setToolTipText("Imagem é tudo sede e nada!!!");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simples);
		c.add(label);
		c.add(imagem);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ControleLabel();

	}

}
