package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Gravidade;

@Document("gravidade")
public class GravidadeCollection {

    @Id
    private Long idGravidade;
    private String descricao;

    // Construtor vazio
    public GravidadeCollection() {
    }

    // Construtor que aceita a classe modelo
    public GravidadeCollection(Gravidade gravidade) {
        this.idGravidade = gravidade.getIdGravidade();
        this.descricao = gravidade.getDescricao();
    }

    // Método para converter de volta para o modelo Java
    public Gravidade converterParaModelo() {
        Gravidade gravidade = new Gravidade();
        gravidade.setIdGravidade(idGravidade);
        gravidade.setDescricao(descricao);
        return gravidade;
    }

    // Getters e Setters
    public Long getIdGravidade() {
        return idGravidade;
    }

    public void setIdGravidade(Long idGravidade) {
        this.idGravidade = idGravidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
