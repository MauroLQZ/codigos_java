package refinado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//A classe aninhamento e a classe envolvente da classe aninhada
//Tambem póde se criar interface dentro de interface
public class Aninhamento extends JFrame {

	JButton botao;
	
	public Aninhamento(){
		
		super("Aninhamento");
		botao = new JButton("OK");
		botao.addActionListener(new ListenerAninhado());
		
		//Dentro do metodo posso incluir uma classe anonima ou sem nome.
		//Tambem tem acesso aos elementos da classe envolvente
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Classe Anonima processa Botao!");
				
			}
		});
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 300);	   
	}
	
	/*  CLASSE ANINHADA*/
	//Uma dentro de outra classe e chamada de aninhada
			//classes aninhadas podem acessar atributos e metodos da classe envolvente
	public class ListenerAninhado implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Classe Aninhada processa Botao!");
			
		}
		
	}
	public static void main(String[] args) {
		Aninhamento janela = new Aninhamento();
		
	    /*CRIANDO UMA CLASSE ANINHADA DIRETAMENTE	*/
		//CRiando um listener aninhado com o tipo nome da classe envolvente.
		//ponto ListenerAninhado
		//pra criar uma instancia da classe aninhada vc precisa de uma
		//instancia da classe envolvente
		Aninhamento.ListenerAninhado listener = janela.new ListenerAninhado();

	}

}
