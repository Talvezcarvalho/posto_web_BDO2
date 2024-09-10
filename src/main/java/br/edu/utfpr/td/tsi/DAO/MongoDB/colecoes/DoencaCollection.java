package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Doenca;

@Document("doenca")
public class DoencaCollection {

    @Id
    private String idDoenca; 
    private String descricao;

    // Construtor vazio
    public DoencaCollection() {
    }

    public DoencaCollection(Doenca doenca) {
        this.idDoenca = doenca.getIdDoenca().toString();
        this.descricao = doenca.getDescricao();
    }

    public Doenca converterParaModelo() {
        Doenca doenca = new Doenca();
        doenca.setIdDoenca(Long.parseLong(idDoenca)); 
        doenca.setDescricao(descricao);
        return doenca;
    }

    // Getters e Setters
    public String getIdDoenca() {
        return idDoenca;
    }

    public void setIdDoenca(String idDoenca) {
        this.idDoenca = idDoenca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método toString
    @Override
    public String toString() {
        return "DoencaCollection [idDoenca=" + idDoenca + ", descricao=" + descricao + "]";
    }
}