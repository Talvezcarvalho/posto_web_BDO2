package br.edu.utfpr.td.tsi.MODELO;

import java.time.LocalDate;
import java.time.Period;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100)
    private String sobrenome;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @OneToOne(
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        optional = false
    )
    @JoinColumn(name = "id_endereco", referencedColumnName = "id")
    private Endereco endereco;

    public Paciente() {}

    public Paciente(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Metodos auxiliares
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    // Isso aqui é um método toString que foi gerado automaticamente pelo IDE
    // serve para facilitar a visualização dos objetos
    @Override
    public String toString() {
        return (
            "Paciente [dataNascimento=" +
            dataNascimento +
            ", endereco=" +
            endereco +
            ", id=" +
            id +
            ", nome=" +
            nome +
            ", sobrenome=" +
            sobrenome +
            "]"
        );
    }
}
