package br.edu.utfpr.td.tsi.DAO.JPA.Entidades;

import javax.persistence.*;

import br.edu.utfpr.td.tsi.MODELO.Medico;

@Entity
@Table(name = "medico", schema = "posto_saude")
public class MedicoEntity {

    @Id
    @Column(name = "idmedico")
    private Long idMedico;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100)
    private String sobrenome;

    @OneToOne
    @JoinColumn(name = "idEspecialidade", referencedColumnName = "idEspecialidade")	
	private EspecialidadeEntity especialidade;

    public MedicoEntity() {
    }

    public MedicoEntity(Medico medico) {
        this.idMedico = medico.getIdMedico();  
        this.nome = medico.getNome();          
        this.sobrenome = medico.getSobrenome();
        this.especialidade = new EspecialidadeEntity(medico.getEspecialidade());
    }

    public Medico converterParaModelo() {
        Medico medico = new Medico();
        medico.setIdMedico(idMedico);
        medico.setNome(nome);
        medico.setSobrenome(sobrenome);
        medico.setEspecialidade(especialidade.converterParaModelo());
        return medico;
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

    public EspecialidadeEntity getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(EspecialidadeEntity especialidade) {
        this.especialidade = especialidade;
    }
}