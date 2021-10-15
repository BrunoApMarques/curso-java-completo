package core;

public class Aluno extends Pessoa {
	private int numeroDeMatricula;
	private String curso;

	public Aluno(String nome, String email, String telefone, int numeroDeMatricula, String curso) {
		super(nome, email, telefone);
		this.numeroDeMatricula = numeroDeMatricula;
		this.curso = curso;
	}

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(int numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String exibir() {
		return "Nome:" + nome + "email : " + email + "telefone : " + telefone + "numero de matricula : "
				+ numeroDeMatricula + "curso : " + curso;
	}
}
