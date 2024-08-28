package br.edu.utfpr.td.tsi.MODELO;

import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name = "medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String crm;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    @ElementCollection(fetch = FetchType.EAGER)
    private Collection<String> especialidades;

    public Medico() {}

    public Medico(
        String crm,
        String nome,
        String email,
        String senha,
        Collection<String> especialidades
    ) {
        this.crm = crm;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.especialidades = especialidades;
    }

    public Long getId() {
        return id;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Collection<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Collection<String> especialidades) {
        this.especialidades = especialidades;
    }
}
