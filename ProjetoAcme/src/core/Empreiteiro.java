package core;

public class Empreiteiro extends Funcionarios {
	private double valor;

	public Empreiteiro(int funcional, String nome) {
		super(funcional, nome);
		// TODO Auto-generated constructor stub
	}

	public double getValorempreita() {
		return valor;
	}

	public double calcularsalario() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double calcularSalario() {
		return valor;
	}
}
