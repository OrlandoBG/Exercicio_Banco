package entities;

public class ContaBanco {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	private final double taxa = 5.0;
	
	
	public ContaBanco(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	public ContaBanco(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular= nomeTitular;
	}
	

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valorDeposito) {
		this.saldo = this.saldo + valorDeposito;
	}
	
	public void saque(double valorSaque) {
		this.saldo -=  valorSaque + this.taxa;
	}
	
	public String toString() {		
		return "Conta "
				+ this.numeroConta
				+ ", Titular: "
				+ this.nomeTitular
				+", saldo: "
				+String.format("%.2f\n",saldo);
	}
	
}
