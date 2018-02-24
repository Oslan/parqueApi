package com.parque.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Conta implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String numero;
	private BigDecimal saldo;
	private BigDecimal limite;
	private Cliente cliente;
	
	public Conta() {}
	
	public Conta(Long id, String numero, BigDecimal saldo, BigDecimal limite, Cliente cliente) {
		super();
		this.id = id;
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	public BigDecimal getLimite() {
		return limite;
	}
	
	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
