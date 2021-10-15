package core;

public class FuncionarioHorista extends Funcionarios {
	private double valorhora;
	private int numeroHora;

	public FuncionarioHorista(int funcional, String nome, double valorhora, int numeroHora) {
		super(funcional, nome);
		this.valorhora = valorhora;
		this.numeroHora = numeroHora;
	}

	public double getValorhora() {
		return valorhora;
	}

	public void setValorhora(double valorhora) {
		this.valorhora = valorhora;
	}

	public int getNumeroHora() {
		return numeroHora;
	}

	public void setNumeroHora(int numeroHora) {
		this.numeroHora = numeroHora;
	}

	public double calcularSalario() {
		return numeroHora;
	}
}
