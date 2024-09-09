package br.edu.utfpr.td.tsi.MODELO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


public class Diagnostico {

    private Long idDiagnostico;
    private Gravidade gravidade;
    private String observacao;
    private Consulta consulta;
    private Doenca doenca;

    // Construtores
    public Diagnostico() {
    }

    public Diagnostico(Long idDiagnostico, Gravidade gravidade, String observacao, Consulta consulta, Doenca doenca) {
        this.idDiagnostico = idDiagnostico;
        this.gravidade = gravidade;
        this.observacao = observacao;
        this.consulta = consulta;
        this.doenca = doenca;
    }

    // Getters e Setters
    public Long getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Long idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Gravidade getGravidade() {
        return gravidade;
    }

    public void setGravidade(Gravidade gravidade) {
        this.gravidade = gravidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Doenca getDoenca() {
        return doenca;
    }

    public void setDoenca(Doenca doenca) {
        this.doenca = doenca;
    }

    // toString()
    @Override
    public String toString() {
        return "Diagnostico{" +
                "idDiagnostico=" + idDiagnostico +
                ", gravidade=" + gravidade +
                ", observacao='" + observacao + '\'' +
                ", consulta=" + consulta +
                ", doenca=" + doenca +
                '}';
    }
}
