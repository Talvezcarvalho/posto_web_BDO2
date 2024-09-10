package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Especialidade;

@Document("especialidade")
public class EspecialidadeCollection {

    @Id
    private String idEspecialidade;
    private String descricao;

    public EspecialidadeCollection() {
    }

    public EspecialidadeCollection(Especialidade especialidade) {
        this.idEspecialidade = especialidade.getIdEspecialidade().toString();
        this.descricao = especialidade.getDescricao();
    }

    public Especialidade converterParaModelo() {
        Especialidade especialidade = new Especialidade();
        especialidade.setIdEspecialidade(Long.parseLong(idEspecialidade));
        especialidade.setDescricao(descricao);
        return especialidade;
    }

    public String getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(String idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "EspecialidadeCollection [idEspecialidade=" + idEspecialidade + ", descricao=" + descricao + "]";
    }
}