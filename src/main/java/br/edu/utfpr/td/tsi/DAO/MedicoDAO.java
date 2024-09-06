package br.edu.utfpr.td.tsi.DAO;


import br.edu.utfpr.td.tsi.MODELO.Medico;

public interface MedicoDAO {
    public void inserir(Medico medico);

    public void atualizar(String id, Medico medico);

    public void remover(String id);

	public java.util.List<Medico> listarTodos();

    public Medico procurarPorId(String id);


}
