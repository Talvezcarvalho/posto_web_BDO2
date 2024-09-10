package br.edu.utfpr.td.tsi.MODELO;

public class Medico {

    private Long idMedico;
    private String nome;
    private String sobrenome;
    private Especialidade especialidade;

    // Construtor vazio
    public Medico() {
    }

    // Getters e Setters
    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
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

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    // Método toString
    @Override
    public String toString() {
        return "Medico [idMedico=" + idMedico + ", nome=" + nome + ", sobrenome=" + sobrenome 
               + ", especialidade=" + especialidade + "]";
    }
}

