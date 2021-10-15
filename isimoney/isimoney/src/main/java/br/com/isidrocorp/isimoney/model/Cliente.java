package br.com.isidrocorp.isimoney.model;

import javax.persistence.*;

@Entity
@Table(name = "tbcliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	@Column(name = "cpf", length = 14)
	private String cpf;
	@Column(name = "email", length = 50)
	private String email;
	public int getCodigo() { 
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Column(name = "telefone", length = 15)
	private String telefone;
}
