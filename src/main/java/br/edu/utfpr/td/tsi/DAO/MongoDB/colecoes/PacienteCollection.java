package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Paciente;

@Document("paciente")
public class PacienteCollection {

    @Id
    private String id;  
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private EnderecoCollection endereco;


    public PacienteCollection() {
    }


    public PacienteCollection(Paciente paciente) {
        this.id = paciente.getIdPaciente().toString();  
        this.nome = paciente.getNome();
        this.sobrenome = paciente.getSobrenome();
        this.dataNascimento = paciente.getDataNascimento();
        this.endereco = new EnderecoCollection(paciente.getEndereco());
    }

    public Paciente converterParaModelo() {
        Paciente paciente = new Paciente();
        paciente.setIdPaciente(Long.parseLong(id));  
        paciente.setNome(nome);
        paciente.setSobrenome(sobrenome);
        paciente.setDataNascimento(dataNascimento);
        paciente.setEndereco(endereco.converterParaModelo());
        return paciente;
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

    // Método toString
    @Override
    public String toString() {
        return "PacienteCollection [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome 
               + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco + "]";
    }
}