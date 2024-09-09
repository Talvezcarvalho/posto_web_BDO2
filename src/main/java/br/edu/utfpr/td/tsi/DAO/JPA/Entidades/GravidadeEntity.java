package br.edu.utfpr.td.tsi.DAO.JPA.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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