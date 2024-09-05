package br.edu.utfpr.td.tsi.MODELO;

import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name = "medico", schema = "posto.saude")
public class Medico {

    @Id
    @Column(name = "idmedico")
    private String idMedico;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100)
    private String sobrenome;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idEspecialidade", referencedColumnName = "idEspecialidade")	
	private Especialidade especialidade;

}