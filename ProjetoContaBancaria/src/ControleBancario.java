
public class ControleBancario {
	private int numero;
	private int agencia;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	

	public ControleBancario(int numero, int agencia, String nomeTitular, String cpfTitular, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.saldo = saldo;
	}

	public String imprimir() {
		return "Conta: " + numero + "-" + agencia + " " + nomeTitular + "(" + cpfTitular + ") R$ " + saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(double valor) {
		if (valor <= saldo) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}
}
