package com.parque.dto;

import java.io.Serializable;

import com.parque.domain.Cliente;

public class EnderecoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String rua;
	private String numero;
	private String bairro;
	private Cliente cliente;
	
	public EnderecoDTO(Long id, String rua, String numero, String bairro) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
