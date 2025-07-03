package redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServidor {

	public static void main(String[] args) throws IOException {

		// como parametro so informar a porta q ele vai responder as conexoes
		ServerSocket server = new ServerSocket(5000);
		//System.out.println(server);
		// Aguarda a chega de um socket ou de novos clientes
		// qdo chega um novo cliente ele retorna um socket p conversa com o
		// cliente
		while (true) {
			Socket socket = server.accept();
			// enviando uma msg para o cliente q se conectou
			try (PrintWriter w = new PrintWriter(socket.getOutputStream())) {
				w.println("Aprenda Java e seja contratado!!!");
			}
		}

	}

}
