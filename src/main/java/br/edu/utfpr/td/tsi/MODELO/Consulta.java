package br.edu.utfpr.td.tsi.MODELO;

import java.time.LocalDate;

import javax.annotation.Generated;
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
public class Consulta {
    
    @Id
    @Column(name = "idconsulta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsulta;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data_consulta", nullable = false, length = 100)
    private LocalDate dataConsulta;

    @ManyToOne
    @JoinColumn(name = "idMedico", referencedColumnName = "idMedico")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "idPaciente", referencedColumnName = "idPaciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "idDiagnostico", referencedColumnName = "idDiagnostico")
    private Diagnostico diagnostico;

    public Consulta() {
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }


}
