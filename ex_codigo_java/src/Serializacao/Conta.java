package Serializacao;

@SuppressWarnings("serial")
public class Conta implements java.io.Serializable{

	String cliente;
	//double saldo;
	transient double saldo;// pra nao aparecer o saldo no objeto serializavel

	public Conta() {
	}

	public Conta(String cliente, double saldo) {
		super();
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
		return "Conta [cliente=" + cliente + ", saldo=" + saldo + "]";
	}

	public String exibeSaldo() {
		return  this.toString();
		
	}
}
