package mauro.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MistoBorder_Grid_Layout extends JFrame {

	public MistoBorder_Grid_Layout() {

		super("Misto_Border_Grid_Layout");

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4, 1));
		c2.add(new JButton("Ok"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup..."));
		c2.add(new JButton("Help"));
		
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		c.add(BorderLayout.EAST, c2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	

	public static void main(String[] args) {

		new MistoBorder_Grid_Layout();

	}

}
