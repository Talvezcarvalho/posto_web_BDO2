package br.edu.utfpr.td.tsi.DAO;

import java.util.List;

import br.edu.utfpr.td.tsi.MODELO.Paciente;

public interface PacienteDAO {
    public void inserir(Paciente p);

    public void atualizar(String id, Paciente p);

    public void remover(String id);

	public java.util.List<Paciente> listarTodos();

    public Paciente procurar(String id);
}
