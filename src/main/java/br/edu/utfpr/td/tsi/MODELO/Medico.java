package br.edu.utfpr.td.tsi.MODELO;

import javax.persistence.*;

@Entity
@Table(name = "medico", schema = "posto_saude")
public class Medico {

    @Id
    @Column(name = "idmedico")
    private Long idMedico;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100)
    private String sobrenome;

    @OneToOne
    @JoinColumn(name = "idEspecialidade", referencedColumnName = "idEspecialidade")	
	private Especialidade especialidade;

    public Medico() {
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public Long getIdMedico() {
        return idMedico;
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
}