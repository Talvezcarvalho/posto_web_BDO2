package br.edu.utfpr.td.tsi.MODELO;

public class Bairro {
    private Long id;
	private String nome;
	
	public Bairro() {
		
	}
		
	public Bairro(Long id, String nome) {
		super();
		this.id = id;
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

}
