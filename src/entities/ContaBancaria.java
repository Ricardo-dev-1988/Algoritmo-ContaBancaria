package entities;

public class ContaBancaria {

	private int numeroConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(int numeroConta, String titular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		depositar(depositoInicial);
	}
	
	public ContaBancaria(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
		
	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double montante) {
		saldo += montante;
	}
	
	public void saque(double montante) {
		saldo -= (montante + 5.00);
	}
	
	public String toString() {
		return numeroConta
				+ ", titular: "
				+ titular
				+ ", saldo: R$"
				+ String.format("%.2f", saldo)
				+ "     ";
	}
}
