package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Paciente;

@Document("paciente")
public class PacienteCollection {

	@Id
	private Long id;
	private String nome;
	private String sobrenome;
	private LocalDate dataNascimento;
	private EnderecoCollection endereco;

	public PacienteCollection() {
	}

	public PacienteCollection(Paciente paciente) {
		this.id = paciente.getIdPaciente();
		this.nome = paciente.getNome();
		this.dataNascimento = paciente.getDataNascimento();
		this.sobrenome = paciente.getSobrenome();
		this.endereco = new EnderecoCollection(paciente.getEndereco());
	}

	public Paciente converterParaModelo() {
		Paciente p = new Paciente();
		p.setIdPaciente(id);
		p.setNome(nome);
		p.setSobrenome(sobrenome);
		p.setDataNascimento(dataNascimento);
		p.setEndereco(endereco.converterParaModelo());
		return p;
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

	public EnderecoCollection getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoCollection endereco) {
		this.endereco = endereco;
	}


}
