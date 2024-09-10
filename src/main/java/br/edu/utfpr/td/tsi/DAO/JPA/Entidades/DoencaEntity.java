package br.edu.utfpr.td.tsi.DAO.JPA.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.utfpr.td.tsi.MODELO.Doenca;
@Entity
@Table(name = "doenca", schema = "posto_saude")
public class DoencaEntity {
    
    @Id
    @Column(name = "iDdoenca")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDoenca;
    private String descricao;

    public DoencaEntity() {
    }

    public DoencaEntity(Doenca doenca) {
        this.idDoenca = doenca.getIdDoenca();
        this.descricao = doenca.getDescricao();
    }

    public Doenca converterParaModelo() {
        Doenca doenca = new Doenca();
        doenca.setIdDoenca(idDoenca);
        doenca.setDescricao(descricao);
        return doenca;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Long getIdDoenca() {
        return idDoenca;
    }

    public void setIdDoenca(Long idDoenca) {
        this.idDoenca = idDoenca;
    }
}