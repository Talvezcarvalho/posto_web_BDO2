package br.edu.utfpr.td.tsi.DAO;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EspecialidadeEntity;

public interface EspecialidadeDAO {
    public void inserir(EspecialidadeEntity especialidade);

    public void atualizar(Long id, EspecialidadeEntity especialidade);

    public void remover(Long id);

    public java.util.List<EspecialidadeEntity> listarTodos();

    public EspecialidadeEntity procurarPorId(Long id);


    
}
