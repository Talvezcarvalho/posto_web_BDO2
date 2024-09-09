package br.edu.utfpr.td.tsi.DAO;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.PacienteEntity;

public interface PacienteDAO {
    public void inserir(PacienteEntity p);
	
	public java.util.List<PacienteEntity> listarTodos();
	
	public void remover(Long id);
}
