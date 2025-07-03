package mauro.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleTeste extends JFrame {

	JTextField login;
	JPasswordField senha;
	JButton ok, cancel;

	public ControleTeste() {
		super("Textos e Senhas");

		login = new JTextField();
		senha = new JPasswordField();
		// botoes
		ok = new JButton("OK");
		ok.addActionListener(new BotaoOkListener());
		cancel = new JButton("Cancel");
		cancel.addActionListener(new BotaoCancelListener());

		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		// add campos
		c.add(new JLabel("Login:"));
		c.add(login);
		c.add(new JLabel("Senha:"));
		c.add(senha);
		// add botoes
		c.add(ok);
		c.add(cancel);

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class BotaoOkListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String s = "login:" + login.getText() + "\nsenha:"
					+ new String(senha.getPassword());
			JOptionPane.showMessageDialog(null, s);
		}
	}

	class BotaoCancelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			login.setText("");
			senha.setText("");
		}

	}

	public static void main(String[] args) {

		new ControleTeste();
	}
}
