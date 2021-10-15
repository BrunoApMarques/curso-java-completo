public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;

	public void imprimir() {
		System.out.println("nome do funcionario : " + nome);
		System.out.println("cargo do funcionario : " + cargo);
		System.out.println("salario do funcioanrio : " + salario);

	}

	public void aumentarSalario(double porcentual) {
		salario = salario + salario * porcentual / 100;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
