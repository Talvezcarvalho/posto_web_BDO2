package br.edu.utfpr.td.tsi.DAO.JPA.Entidades;

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
public class DiagnosticoEntity {
    @Id
    @Column(name = "iddiagnostico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiagnostico;

    @ManyToOne
    @JoinColumn(name = "idGravidade", referencedColumnName = "idGravidade")
    private GravidadeEntity gravidade;

    @Column(nullable = false, length = 200)
    private String observacao;

    @ManyToOne
    @JoinColumn(name = "idConsulta", referencedColumnName = "idConsulta")
    private ConsultaEntity consulta;  

    @ManyToOne
    @JoinColumn(name = "idDoenca", referencedColumnName = "idDoenca", nullable = false)
    private DoencaEntity doenca;






}