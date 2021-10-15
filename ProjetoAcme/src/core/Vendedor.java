package core;

public class Vendedor extends Funcionarios {
	protected double salariobase;
	protected double comissao;

	public Vendedor(int funcional, String nome, double salariobase, double comissao) {
		super(funcional, nome);
		this.salariobase = salariobase;
		this.comissao = comissao;
	}

	public double getSalariobase() {
		return salariobase;
	}

	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalario() {
		return salariobase + salariobase * comissao / 100;
	}

}