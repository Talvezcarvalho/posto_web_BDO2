package br.edu.utfpr.td.tsi.MODELO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.TypeAlias;

@Entity
@Table(name = "diagnostico", schema = "posto_saude")
public class Diagnostico {
    @Id
    @Column(name = "iddiagnostico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiagnostico;

    @OneToOne
    @JoinColumn(name = "idGravidade", referencedColumnName = "idGravidade")
    private Gravidade gravidade;

    @Column(nullable = false, length = 200)
    private String observacao;

    @OneToOne
    @JoinColumn(name = "idConsulta", referencedColumnName = "idConsulta")
    


}
