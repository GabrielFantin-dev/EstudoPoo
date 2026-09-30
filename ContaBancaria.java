package conta;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public String gettitular() {
		return titular;
	}
	public void settitular(String nome) {
		this.titular = "Gabriel";
	}
	public int getsaldo() {
		return (int) saldo;
	}
	
	public void setsaldo() {
	this.saldo = 33;
}
}