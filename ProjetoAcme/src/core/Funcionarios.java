package core;

public abstract class Funcionarios {
	protected int funcional;
	protected String nome;

	public Funcionarios(int funcional, String nome) {
		super();
		this.funcional = funcional;
		this.nome = nome;
	}

	public int getFuncional() {
		return funcional;
	}

	public void setFuncional(int funcional) {
		this.funcional = funcional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract double calcularSalario();
}
