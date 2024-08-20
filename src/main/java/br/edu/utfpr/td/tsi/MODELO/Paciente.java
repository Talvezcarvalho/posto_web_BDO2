package br.edu.utfpr.td.tsi.MODELO;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;



import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "paciente", schema = "posto.saude")
public class Paciente {

	@Id
	@Column(name = "idpaciente")
	private String idPaciente;
	
	@Column(nullable = false, length = 100)
	private String nome;

	@Column(nullable = false, length = 100)
	private String sobrenome;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data_nascimento", nullable = false, length = 100)
	private LocalDate dataNascimento;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "idendereco", referencedColumnName = "idendereco")
	private Endereco endereco;

	public Paciente() {
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
