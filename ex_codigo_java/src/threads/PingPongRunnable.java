package threads;

public class PingPongRunnable implements Runnable {

	String palavra;
	long tempo;

	public PingPongRunnable(String pal, long tempo) {
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
		
		Runnable ping = new PingPongRunnable("ping", 1500);
		Runnable pong = new PingPongRunnable("PONG", 2000);
		
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
		System.out.println("Ver Thread!!!!!");

	}

}
