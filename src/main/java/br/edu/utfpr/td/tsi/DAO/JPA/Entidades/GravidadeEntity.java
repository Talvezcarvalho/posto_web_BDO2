package br.edu.utfpr.td.tsi.DAO.JPA.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.utfpr.td.tsi.MODELO.Gravidade;

@Entity
@Table(name = "gravidade" , schema = "posto_saude")
public class GravidadeEntity {
    
    @Id
    @Column(name = "idgravidade")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGravidade;
    private String descricao;

    public GravidadeEntity() {
    }
    public GravidadeEntity(Gravidade gravidade) {
        this.idGravidade = gravidade.getIdGravidade();
        this.descricao = gravidade.getDescricao();
    }

    public Gravidade converterParaModelo() {
        Gravidade gravidade = new Gravidade();
        gravidade.setIdGravidade(idGravidade);
        gravidade.setDescricao(descricao);
        return gravidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Long getIdGravidade() {
        return idGravidade;
    }

    public void setIdGravidade(Long idGravidade) {
        this.idGravidade = idGravidade;
    }
}