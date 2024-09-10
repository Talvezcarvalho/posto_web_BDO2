package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Consulta;

@Document("consulta")
public class ConsultaCollection {

    @Id
    private String idConsulta; 
    private LocalDate dataConsulta;
    private String situacao;
    private MedicoCollection medico;
    private PacienteCollection paciente;

    public ConsultaCollection() {
    }

    public ConsultaCollection(Consulta consulta) {
        this.idConsulta = consulta.getIdConsulta().toString();  
        this.dataConsulta = consulta.getDataConsulta();
        this.situacao = consulta.getSituacao();
        this.medico = new MedicoCollection(consulta.getMedico());
        this.paciente = new PacienteCollection(consulta.getPaciente());
    }

  
    public Consulta converterParaModelo() {
        Consulta consulta = new Consulta();
        consulta.setIdConsulta(Long.parseLong(idConsulta)); 
        consulta.setDataConsulta(dataConsulta);
        consulta.setSituacao(situacao);
        consulta.setMedico(medico.converterParaModelo());
        consulta.setPaciente(paciente.converterParaModelo());
        return consulta;
    }

  
    public String getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(String idConsulta) {
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

    @Override
    public String toString() {
        return "ConsultaCollection [idConsulta=" + idConsulta + ", dataConsulta=" + dataConsulta + ", situacao=" + situacao
                + ", medico=" + medico + ", paciente=" + paciente + "]";
    }
}
