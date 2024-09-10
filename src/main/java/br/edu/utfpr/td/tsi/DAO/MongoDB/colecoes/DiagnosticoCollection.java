package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Diagnostico;

@Document("diagnostico")
public class DiagnosticoCollection {

    @Id
    private Long idDiagnostico;
    private GravidadeCollection gravidade;
    private String observacao;
    private ConsultaCollection consulta;
    private DoencaCollection doenca;

    // Construtores
    public DiagnosticoCollection() {
    }

    public DiagnosticoCollection(Diagnostico diagnostico) {
        this.idDiagnostico = diagnostico.getIdDiagnostico();
        this.gravidade = new GravidadeCollection(diagnostico.getGravidade());
        this.observacao = diagnostico.getObservacao();
        this.consulta = new ConsultaCollection(diagnostico.getConsulta());
        this.doenca = new DoencaCollection(diagnostico.getDoenca());
    }

    // Método para converter de volta para o modelo Java
    public Diagnostico converterParaModelo() {
        Diagnostico diagnostico = new Diagnostico();
        diagnostico.setIdDiagnostico(idDiagnostico);
        diagnostico.setGravidade(gravidade.converterParaModelo());
        diagnostico.setObservacao(observacao);
        diagnostico.setConsulta(consulta.converterParaModelo());
        diagnostico.setDoenca(doenca.converterParaModelo());
        return diagnostico;
    }

    // Getters e Setters
    public Long getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Long idDiagnostico) {
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

    public ConsultaCollection getConsulta() {
        return consulta;
    }

    public void setConsulta(ConsultaCollection consulta) {
        this.consulta = consulta;
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
                "idDiagnostico=" + idDiagnostico +
                ", gravidade=" + gravidade +
                ", observacao='" + observacao + '\'' +
                ", consulta=" + consulta +
                ", doenca=" + doenca +
                '}';
    }
}