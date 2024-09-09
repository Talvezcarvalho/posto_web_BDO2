package br.edu.utfpr.td.tsi.MODELO;

public class Bairro {

    private Long id;
    private String nome;

    // Construtor vazio (padrão)
    public Bairro() {}

    // Construtor com parâmetros
    public Bairro(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Bairro [id=" + id + ", nome=" + nome + "]";
    }
}
