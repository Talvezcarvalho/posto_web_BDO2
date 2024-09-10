package br.edu.utfpr.td.tsi.DAO.JPA.Entidades;

import java.time.LocalDate;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import br.edu.utfpr.td.tsi.MODELO.Paciente;

@Entity
@Table(name = "paciente", schema = "posto_saude")
public class PacienteEntity {

	@Id
	@Column(name = "idpaciente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaciente;

	@Column(nullable = false, length = 100)
	private String nome;

	@Column(nullable = false, length = 100)
	private String sobrenome;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data_nascimento", nullable = false, length = 100)
	private LocalDate dataNascimento;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idendereco", referencedColumnName = "idendereco")	
	private EnderecoEntity endereco;

	public PacienteEntity() {
	}
	public PacienteEntity(Paciente paciente) {
		this.idPaciente = paciente.getIdPaciente();
		this.nome = paciente.getNome();
		this.dataNascimento = paciente.getDataNascimento();
		this.sobrenome = paciente.getSobrenome();
		this.endereco = new EnderecoEntity(paciente.getEndereco());
	}
	
	public Paciente converterParaModelo() {
		Paciente paciente = new Paciente();
		paciente.setIdPaciente(idPaciente);
		paciente.setNome(nome);
		paciente.setSobrenome(sobrenome);
		paciente.setDataNascimento(dataNascimento);
		paciente.setEndereco(endereco.converterParaModelo());
		return paciente;
	}
	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Long getIdPaciente() {
		return idPaciente;
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

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}
    @Override
    public String toString() {
        return (
            ""
        );
    }
}