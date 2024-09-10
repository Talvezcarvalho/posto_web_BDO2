package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Diagnostico;

@Document("diagnostico")
public class DiagnosticoCollection {

    @Id
    private String idDiagnostico; 
    private GravidadeCollection gravidade;
    private String observacao;
    private DoencaCollection doenca;

    public DiagnosticoCollection() {
    }

    public DiagnosticoCollection(Diagnostico diagnostico) {
        this.idDiagnostico = diagnostico.getIdDiagnostico().toString();
        this.gravidade = new GravidadeCollection(diagnostico.getGravidade());
        this.observacao = diagnostico.getObservacao();
        this.doenca = new DoencaCollection(diagnostico.getDoenca());
    }

  
    public Diagnostico converterParaModelo() {
        Diagnostico diagnostico = new Diagnostico();
        diagnostico.setIdDiagnostico(Long.parseLong(idDiagnostico));
        diagnostico.setGravidade(gravidade.converterParaModelo());
        diagnostico.setObservacao(observacao);
        diagnostico.setDoenca(doenca.converterParaModelo());
        return diagnostico;
    }

    // Getters e Setters
    public String getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(String idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public GravidadeCollection getGravidade() {
        return gravidade;
    }

    public void setGravidade(GravidadeCollection gravidade) {
        this.gravidade = gravidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public DoencaCollection getDoenca() {
        return doenca;
    }

    public void setDoenca(DoencaCollection doenca) {
        this.doenca = doenca;
    }

    // toString()
    @Override
    public String toString() {
        return "DiagnosticoCollection{" +
                "idDiagnostico='" + idDiagnostico + '\'' +
                ", gravidade=" + gravidade +
                ", observacao='" + observacao + '\'' +
                ", doenca=" + doenca +
                '}';
    }
}