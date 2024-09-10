package br.edu.utfpr.td.tsi.DAO;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.PacienteEntity;
import br.edu.utfpr.td.tsi.MODELO.Paciente;

public interface PacienteDAO {
    public void inserir(Paciente p);
	
	public java.util.List<Paciente> listarTodos();
	
	public void remover(Long id);
}
