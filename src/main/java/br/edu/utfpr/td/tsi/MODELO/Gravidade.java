package br.edu.utfpr.td.tsi.MODELO;
public class Gravidade {

    private Long idGravidade;
    private String descricao;

    // Construtor vazio
    public Gravidade() {
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

    // Método toString
    @Override
    public String toString() {
        return "Gravidade [idGravidade=" + idGravidade + ", descricao=" + descricao + "]";
    }
}

