package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Consulta;

@Document("consulta")
public class ConsultaCollection {

    @Id
    private Long idConsulta;
    private LocalDate dataConsulta;
    private String situacao;
    private MedicoCollection medico;
    private PacienteCollection paciente;
    private DiagnosticoCollection diagnostico;

    // Construtor vazio
    public ConsultaCollection() {
    }

    public ConsultaCollection(Consulta consulta) {
        this.idConsulta = consulta.getIdConsulta();
        this.dataConsulta = consulta.getDataConsulta();
        this.situacao = consulta.getSituacao();
        this.medico = new MedicoCollection(consulta.getMedico());
        this.paciente = new PacienteCollection(consulta.getPaciente());
        this.diagnostico = new DiagnosticoCollection(consulta.getDiagnostico());
    }

    // Método para converter a collection de volta para o modelo original
    public Consulta converterParaModelo() {
        Consulta consulta = new Consulta();
        consulta.setIdConsulta(idConsulta);
        consulta.setDataConsulta(dataConsulta);
        consulta.setSituacao(situacao);
        consulta.setMedico(medico.converterParaModelo());
        consulta.setPaciente(paciente.converterParaModelo());
        consulta.setDiagnostico(diagnostico.converterParaModelo());
        return consulta;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public MedicoCollection getMedico() {
        return medico;
    }

    public void setMedico(MedicoCollection medico) {
        this.medico = medico;
    }

    public PacienteCollection getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteCollection paciente) {
        this.paciente = paciente;
    }

    public DiagnosticoCollection getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(DiagnosticoCollection diagnostico) {
        this.diagnostico = diagnostico;
    }

    // Método toString
    @Override
    public String toString() {
        return "ConsultaCollection [idConsulta=" + idConsulta + ", dataConsulta=" + dataConsulta + ", situacao=" + situacao
                + ", medico=" + medico + ", paciente=" + paciente + ", diagnostico=" + diagnostico + "]";
    }
}