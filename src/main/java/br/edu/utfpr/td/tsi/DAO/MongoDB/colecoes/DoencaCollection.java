package br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.utfpr.td.tsi.MODELO.Doenca;

@Document("doenca")
public class DoencaCollection {

    @Id
    private Long idDoenca;
    private String descricao;

    // Construtor vazio
    public DoencaCollection() {
    }

    // Construtor que converte o modelo original para a collection do MongoDB
    public DoencaCollection(Doenca doenca) {
        this.idDoenca = doenca.getIdDoenca();
        this.descricao = doenca.getDescricao();
    }

    // Método para converter a collection de volta para o modelo original
    public Doenca converterParaModelo() {
        Doenca doenca = new Doenca();
        doenca.setIdDoenca(idDoenca);
        doenca.setDescricao(descricao);
        return doenca;
    }

    // Getters e Setters
    public Long getIdDoenca() {
        return idDoenca;
    }

    public void setIdDoenca(Long idDoenca) {
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
