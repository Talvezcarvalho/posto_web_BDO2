package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Especialidade;

@Document("especialidade")
public class EspecialidadeCollection {

    @Id
    private Long idEspecialidade;
    private String descricao;
    
    
    public EspecialidadeCollection() {
    }

    public EspecialidadeCollection(Especialidade especialidade) {
        this.idEspecialidade = especialidade.getIdEspecialidade();
        this.descricao = especialidade.getDescricao();
    }

    public Especialidade converterParaModelo() {
        Especialidade especialidade = new Especialidade();
        especialidade.setIdEspecialidade(idEspecialidade);
        especialidade.setDescricao(descricao);
       
        return especialidade;
    }

    public Long getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(Long idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}