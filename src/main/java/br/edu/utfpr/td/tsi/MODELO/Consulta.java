package br.edu.utfpr.td.tsi.MODELO;

import java.time.LocalDate;

public class Consulta {

    private Long idConsulta;
    private LocalDate dataConsulta;
    private String situacao;
    private Medico medico;
    private Paciente paciente;
    private Diagnostico diagnostico;

    // Construtor vazio
    public Consulta() {
    }

    // Getters e Setters
    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    // Método toString
    @Override
    public String toString() {
        return "Consulta [idConsulta=" + idConsulta + ", dataConsulta=" + dataConsulta + ", situacao=" + situacao
                + ", medico=" + medico + ", paciente=" + paciente + ", diagnostico=" + diagnostico + "]";
    }
}

