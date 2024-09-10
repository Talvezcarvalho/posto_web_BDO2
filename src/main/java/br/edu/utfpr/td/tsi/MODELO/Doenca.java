package br.edu.utfpr.td.tsi.MODELO;

public class Doenca {

    private Long idDoenca;
    private String descricao;

    // Construtor vazio
    public Doenca() {
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
        return "Doenca [idDoenca=" + idDoenca + ", descricao=" + descricao + "]";
    }
}

