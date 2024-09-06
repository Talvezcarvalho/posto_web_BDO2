package br.edu.utfpr.td.tsi.MODELO;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "especialidade", schema = "posto_saude")
public class Especialidade {
    
    @Id
    @Column(name = "idespecialidade")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspecialidade;
    private String descricao;
    
    @OneToMany(mappedBy = "especialidade")
    private Collection<Medico> medicos;

    public Especialidade() {
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Long getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(Long idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }
}
