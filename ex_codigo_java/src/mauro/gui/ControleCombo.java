package mauro.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener{
	
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/foto1a.gif")),
			new ImageIcon(getClass().getResource("fotos/foto2a.gif")),
			new ImageIcon(getClass().getResource("fotos/foto3a.jpg")),
			new ImageIcon(getClass().getResource("fotos/foto4a.gif"))			
	};

	public ControleCombo() {

		super("Album de Fotos");
		
		Container c = getContentPane();
		
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.PLAIN, 26));
		//Representam as imagens
		combo.addItem("Familia");
		combo.addItem("Manga");
		combo.addItem("Banana");
		combo.addItem("Choro");
		combo.addItemListener(this);
		
		//inicializando o label com a primeira imagem do array.
		label = new JLabel(imagens[0]);
		
		//add ao container
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 530);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		//verificar se o combo foi alterado e recuperar o tipo de mudança
		if (e.getStateChange() == ItemEvent.SELECTED){
			//recebe a posicao q foi selecionado no seu combo
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
		
	}

	public static void main(String[] args) {
		new ControleCombo();

	}

}
