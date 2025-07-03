package threads;

public class PingPong extends Thread {

	String palavra;
	long tempo;

	public PingPong(String pal, long tempo) {
		this.palavra = pal;
		this.tempo = tempo;
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(palavra);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			//quando a exceção acontecer kero parar a execução da thread
			//todo metodo q retorn algum valor e para de ser executado
			return;
		}
	}

	public static void main(String[] args) {
		// ex de como o jvm executa uma thread num programa
		// debugamos a linha pra verificar a thread
		// System.out.println("Ver Thread!!!!!");

		// Criando um objeto Thread
		// Thread t = new Thread();
		new PingPong("ping", 1500).start();
		new PingPong("PONG", 2000).start();
		System.out.println("Ver Thread!!!!!");

	}

}
