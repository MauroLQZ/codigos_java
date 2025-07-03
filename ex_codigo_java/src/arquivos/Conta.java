package arquivos;

public class Conta {

	private String cliente;
	private double saldo;

	public Conta() {}
	public Conta(String cliente, double saldo){
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return cliente + "seu saldo e " + saldo;
	}

	public String exibeSaldo() {
		return cliente + "seu saldo e " + saldo;
		
	}
}



