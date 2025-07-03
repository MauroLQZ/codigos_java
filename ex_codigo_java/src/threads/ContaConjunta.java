package threads;

public class ContaConjunta {
    
	/*
	 * usado para pegar os atributos publicos na Reflect
	 *public int saldo = 100;
	 *public String name;
    */
	private int saldo = 100;
	public int getSaldo() {
		return saldo;
	}

	public synchronized void sacar(int valor, String cliente) {
		if (saldo >= valor) {
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar");
			try {
				System.out.println(cliente + " aguardando...");
				Thread.sleep(1000);//aguardando processamento
			} catch (InterruptedException e) {	}
			saldo -= valor;
			String msg = cliente + " SACOU "+ valor +
					"[Saldo Original= " + saldoOriginal +
					", Saldo Final= "+saldo+ "]";			
			System.out.println(msg);
		} else {
			System.out.println("Saldo insuficiente para : "+cliente );
		}

	}
}
