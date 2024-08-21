package br.edu.utfpr.td.tsi.MODELO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco", schema = "posto.saude")
public class Endereco {
<<<<<<< HEAD
  private Long id;
	private String logradouro;
=======
	@Id
	@Column(name = "idendereco")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String logradouro; 
>>>>>>> refs/remotes/origin/main
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

