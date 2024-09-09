package br.edu.utfpr.td.tsi.DAO;


import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.MedicoEntity;

public interface MedicoDAO {
    public void inserir(MedicoEntity medico);

    public void atualizar(Long id, MedicoEntity medico);

    public void remover(Long id);

	public java.util.List<MedicoEntity> listarTodos();

    public MedicoEntity procurarPorId(Long id);


}
