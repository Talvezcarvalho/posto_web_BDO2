package br.edu.utfpr.td.tsi.DAO;


import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.MedicoEntity;
import br.edu.utfpr.td.tsi.MODELO.Medico;

public interface MedicoDAO {
    public void inserir(Medico medico);

    public void atualizar(Long id, Medico medico);

    public void remover(Long id);

	public java.util.List<Medico> listarTodos();

    public Medico procurarPorId(Long id);


}
