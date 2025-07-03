package sistema;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Sistemas {

	public static void main(String[] args) throws IOException {
		//Recuperar propriedades do sist operacional
		//o ambiente onde vc esta executando seu programa
		//Objeto tipo properties e uma colecao do tipo Map
		Properties p = System.getProperties();
		System.out.println(p.getProperty("java.version"));
        //definir propriedades do sistema
		p.setProperty("JAVA_ESTUDO.EstudoJavaSE", "1.0.0");
	
		/*
		//lista as propriedades do sist
	    Set<Object> pk = p.keySet();
	    for (Object key : pk) {
			System.out.println(key + " = "+ p.get(key));
		}
		*/
		/*
		 * Trecho de programa p ser usado no prompt de comando
		 * para digitar uma senha sem ser vista e recuperar ela..
		//Objeto do tipo console recupera uma senha do usuario de forma segura
		//sem apresentar a senha
		Console c = System.console();
		//ler uma linha de informacao do sistema
		System.out.println("Usuario: ");
		String user = c.readLine();
		System.out.println("Senha: ");
		char[] senha = c.readPassword();
		System.out.println("Usuario : "+ user +"Senha : "+ new String(senha));
		*/
		//Permite q vc execute um programa diretamente no sist op
		//vc executara ex o notepad
		Runtime.getRuntime().exec("notepad");	
	}

}
