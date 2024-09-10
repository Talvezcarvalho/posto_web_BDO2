package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Medico;

@Document("medico")
public class MedicoCollection {

    @Id
    private Long id;
    private String nome;
    private String sobrenome;
    private EspecialidadeCollection especialidade;

    // Construtor vazio
    public MedicoCollection() {
    }

    public MedicoCollection(Medico medico) {
        this.id = medico.getIdMedico();
        this.nome = medico.getNome();
        this.sobrenome = medico.getSobrenome();
        if (medico.getEspecialidade() != null) {
            this.especialidade = new EspecialidadeCollection(medico.getEspecialidade());
        }
    }

    public Medico converterParaModelo() {
        Medico medico = new Medico();
        medico.setIdMedico(id);
        medico.setNome(nome);
        medico.setSobrenome(sobrenome);
        if (especialidade != null) {
            medico.setEspecialidade(especialidade.converterParaModelo());
        }
        return medico;
    }

    // Getters e Setters
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

    public EspecialidadeCollection getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(EspecialidadeCollection especialidade) {
        this.especialidade = especialidade;
    }

    // Método toString
    @Override
    public String toString() {
        return "MedicoCollection [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome 
               + ", especialidade=" + especialidade + "]";
    }
}