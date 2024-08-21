package br.edu.utfpr.td.tsi.MODELO;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Endereco {
  private Long id;
	private String logradouro;
	private String numero;
	private String cep;

	@ManyToOne
	@JoinColumn(name = "idbairro",referencedColumnName = "idbairro")
	private Bairro bairro;

	public Long getID() {
		return id;
	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
}

