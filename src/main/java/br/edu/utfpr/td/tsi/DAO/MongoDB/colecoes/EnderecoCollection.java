package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Endereco;

@Document("endereco")
public class EnderecoCollection {

    @Id
	private Long id;
	private String logradouro;
	private String numero;
	private String cep;
	private BairroCollection bairro;

	public EnderecoCollection() {

	}

	public EnderecoCollection(Endereco endereco) {
		this.id = endereco.getId();
		this.logradouro = endereco.getLogradouro();
		this.numero = endereco.getNumero();
		this.cep = endereco.getCep();
		this.bairro = new BairroCollection(endereco.getBairro());
	}

	public Endereco converterParaModelo() {
		Endereco end = new Endereco();
		end.setId(id);
		end.setCep(cep);
		end.setLogradouro(logradouro);
		end.setNumero(numero);
		end.setBairro(bairro.converterParaModelo());
		return end;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public BairroCollection getBairro() {
		return bairro;
	}

	public void setBairro(BairroCollection bairro) {
		this.bairro = bairro;
	}

}
