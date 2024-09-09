package br.edu.utfpr.td.tsi.DAO.JPA.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.utfpr.td.tsi.MODELO.Bairro;

@Entity
@Table(name = "bairro", schema = "posto_saude")
public class BairroEntity {

    @Id
    @Column(name = "idBairro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    public BairroEntity() {}
    
    public Bairro converterParaModelo() {
		Bairro bairro = new Bairro();
		bairro.setId(id);
		bairro.setNome(nome);
		return bairro;
	}

    public BairroEntity(String nome) {
        this.nome = nome;
    }

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

    @Override
    public String toString() {
        return "Bairro [id=" + id + ", nome=" + nome + "]";
    }
}
