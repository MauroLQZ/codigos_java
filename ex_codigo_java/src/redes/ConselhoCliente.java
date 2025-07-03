package redes;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//import javax.xml.ws.handler.MessageContext.Scope;

public class ConselhoCliente {

	public static void main(String[] args) throws Exception, IOException {
		
		/*criando um objeto q representa uma conexao de rede
		 *parametro = o endereco local 127.0.0.1 e o numero da porta tcp 
		 *onde o programa esta rodando 
		 * o servidor http da internet e executado na porta 80
		 * o servidor de envio de email smtp e na porta 25
		 * 65535 tcp disponiveis - sendo de 0 a 1023 nao devem ser usados, pois ja tem servi�os
		 * 
		 */
		//Socket socket = new Socket("127.0.0.1", 5000);
		//para ler uma msg usa o getInputStream
		//Scanner s = new Scanner(socket.getInputStream());
        //System.out.println("Mensagem: "+s.nextLine());
	    //s.close();
	}

}
