package br.edu.utfpr.td.tsi.MODELO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "diagnostico", schema = "posto_saude")
public class Diagnostico {
    @Id
    @Column(name = "iddiagnostico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiagnostico;

    @ManyToOne
    @JoinColumn(name = "idGravidade", referencedColumnName = "idGravidade")
    private Gravidade gravidade;

    @Column(nullable = false, length = 200)
    private String observacao;

    @ManyToOne
    @JoinColumn(name = "idConsulta", referencedColumnName = "idConsulta")
    private Consulta consulta;  

    @ManyToOne
    @JoinColumn(name = "idDoenca", referencedColumnName = "idDoenca", nullable = false)
    private Doenca doenca;






}
