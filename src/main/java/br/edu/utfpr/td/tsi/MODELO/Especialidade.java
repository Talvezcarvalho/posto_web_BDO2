package br.edu.utfpr.td.tsi.MODELO;

import java.util.Collection;

public class Especialidade {

    private Long idEspecialidade;
    private String descricao;

    // Construtor vazio
    public Especialidade() {
    }

    // Getters e Setters
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

    // Método toString
    @Override
    public String toString() {
        return "Especialidade [idEspecialidade=" + idEspecialidade + ", descricao=" + descricao + "]";
    }
}
