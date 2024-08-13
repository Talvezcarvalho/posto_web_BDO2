package br.edu.utfpr.td.tsi.DAO;

import java.util.List;

import br.edu.utfpr.td.tsi.MODELO.Bairro;

public interface BairroDAO {
    public void inserir(Bairro bairro);

	public void atualizar(Long id, Bairro bairro);

	public void remover(Long id);

	public List<Bairro> listarTodos();
	
	public Bairro procurar(Long id);
}