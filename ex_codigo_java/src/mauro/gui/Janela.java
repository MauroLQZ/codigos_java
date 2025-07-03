package mauro.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {

	public Janela() {

		// JFrame frame = new JFrame();//JFrame e a janela onde vc constroi seu
		// aplicativo
		//JButton botao = new JButton("Clique");// Cria o botao pra janela
		// frame.getContentPane().add(botao);//Recupera o container da nossa
		// janela e add controles(botao)
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//define como
		// fechara a janela qdo cli clikar no x.
		// frame.setSize(300, 300);//dimensiona o tamanho da janela
		// frame.setVisible(true);//Mantem a janela visivel se true

		// Com a extends JFrame nao é necessario chamar frame, chamar os metodos
		// direto
		super("Minha Janela");// Construtor do JFrame com nome

		JButton botao = new JButton("Clique");// Cria o botao pra janela
		getContentPane().add(botao);// Recupera o container da nossa janela e
									// add controles(botao)

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// define como fechara a
														// janela qdo cli clikar
														// no x.
		setSize(300, 300);// dimensiona o tamanho da janela
		setVisible(true);// Mantem a janela visivel se true

	}

	public static void main(String[] args) {

		new Janela();
	}
}
