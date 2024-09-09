package br.edu.utfpr.td.tsi.DAO.JPA.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
