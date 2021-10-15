package core;

public class ContaCorrente {

	protected int numeroConta;
	protected String nomeTitular;
	protected double saldo;
	
	public ContaCorrente(int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta= numeroConta;
		this.nomeTitular=nomeTitular;
		this.saldo=saldo;
	}
	
	public String exibir() {
		return "Numero da conta : " +numeroConta+"Nome titular : "+nomeTitular+ "Saldo : "+saldo;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo+valor;
	}
	
	public boolean sacar(double valor) {
		if(saldo>=valor) {
			saldo =saldo - valor;
			return true;
		}else {
			return false;
		}
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
	
	
	
	


