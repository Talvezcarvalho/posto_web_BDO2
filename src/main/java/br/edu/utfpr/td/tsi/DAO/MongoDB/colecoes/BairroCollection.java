package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Bairro;

@Document("bairro")
public class BairroCollection {

	@Id
	private Long id;
	private String nome;

	public BairroCollection() {

	}
	
	public BairroCollection(Bairro bairro) {
		this.id = bairro.getId();
		this.nome = bairro.getNome();
	}
	
	public Bairro converterParaModelo() {
		Bairro bairro = new Bairro();
		bairro.setId(id);
		bairro.setNome(nome);
		return bairro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}