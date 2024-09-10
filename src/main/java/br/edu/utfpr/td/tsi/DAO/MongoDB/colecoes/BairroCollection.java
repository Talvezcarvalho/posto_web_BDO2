package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Bairro;

@Document("bairro")
public class BairroCollection {

	@Id
	private String id;
	private String nome;

	public BairroCollection() {

	}
	
	public BairroCollection(Bairro bairro) {
		this.id = bairro.getId().toString();
		this.nome = bairro.getNome();
	}
	
	public Bairro converterParaModelo() {
		Bairro bairro = new Bairro();
		bairro.setId(Long.parseLong(id));
		bairro.setNome(nome);
		return bairro;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}