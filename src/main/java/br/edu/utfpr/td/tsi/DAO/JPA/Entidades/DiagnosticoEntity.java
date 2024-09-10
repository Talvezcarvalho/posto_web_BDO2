package br.edu.utfpr.td.tsi.DAO.JPA.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.utfpr.td.tsi.MODELO.Diagnostico;


@Entity
@Table(name = "diagnostico", schema = "posto_saude")
public class DiagnosticoEntity {
    @Id
    @Column(name = "iddiagnostico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiagnostico;

    @ManyToOne
    @JoinColumn(name = "idGravidade", referencedColumnName = "idGravidade")
    private GravidadeEntity gravidade;

    @Column(nullable = false, length = 200)
    private String observacao;

    @ManyToOne
    @JoinColumn(name = "idDoenca", referencedColumnName = "idDoenca", nullable = false)
    private DoencaEntity doenca;


    public DiagnosticoEntity() {
    }

    public DiagnosticoEntity(Diagnostico diagnostico) {
        this.idDiagnostico = diagnostico.getIdDiagnostico();
        this.gravidade = new GravidadeEntity(diagnostico.getGravidade());
        this.observacao = diagnostico.getObservacao();
        this.doenca = new DoencaEntity(diagnostico.getDoenca());
    }

    public Diagnostico converterParaModelo() {
        Diagnostico diagnostico = new Diagnostico();
        diagnostico.setIdDiagnostico(idDiagnostico);
        diagnostico.setGravidade(gravidade.converterParaModelo());
        diagnostico.setObservacao(observacao);
        diagnostico.setDoenca(doenca.converterParaModelo());
        return diagnostico;
    }


    public void setIdDiagnostico(Long idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Long getIdDiagnostico() {
        return idDiagnostico;
    }

    public GravidadeEntity getGravidade() {
        return gravidade;
    }

    public void setGravidade(GravidadeEntity gravidade) {
        this.gravidade = gravidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public DoencaEntity getDoenca() {
        return doenca;
    }

    public void setDoenca(DoencaEntity doenca) {
        this.doenca = doenca;
    }
}