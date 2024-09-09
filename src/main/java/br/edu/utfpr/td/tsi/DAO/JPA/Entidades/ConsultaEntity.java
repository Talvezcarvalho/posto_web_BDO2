package br.edu.utfpr.td.tsi.DAO.JPA.Entidades;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "consulta", schema = "posto_saude")
public class ConsultaEntity {
    
    @Id
    @Column(name = "idconsulta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsulta;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data_consulta", nullable = false, length = 100)
    private LocalDate dataConsulta;

    @Column(name = "situacao", nullable = false, length = 100)
    private String situacao;


    @ManyToOne
    @JoinColumn(name = "idMedico", referencedColumnName = "idMedico",nullable = false)
    private MedicoEntity medico;

    @ManyToOne
    @JoinColumn(name = "idPaciente", referencedColumnName = "idPaciente",nullable = false)
    private PacienteEntity paciente;

    @ManyToOne
    @JoinColumn(name = "idDiagnostico", referencedColumnName = "idDiagnostico" ,nullable = true)
    private DiagnosticoEntity diagnostico;

    public ConsultaEntity() {
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Long getIdConsulta() {
        return idConsulta;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public MedicoEntity getMedico() {
        return medico;
    }

    public void setMedico(MedicoEntity medico) {
        this.medico = medico;
    }

    public PacienteEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteEntity paciente) {
        this.paciente = paciente;
    }

    public DiagnosticoEntity getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(DiagnosticoEntity diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
}
