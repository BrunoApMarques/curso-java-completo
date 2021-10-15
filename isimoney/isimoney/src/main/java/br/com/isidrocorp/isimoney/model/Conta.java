package br.com.isidrocorp.isimoney.model;

import javax.persistence.*;

@Entity
@Table(name = "tbconta")
public class Conta {
	@Id
	@Column(name = "numero")
	private int numero;
	@Column(name = "agencia")
	private int agencia;
	@Column(name = "tipo")
	private int tipo;
	@Column(name = "saldo")
	private double saldo;
	@ManyToOne
	@JoinColumn(name = "codigocliente")
	private Cliente titular;

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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
