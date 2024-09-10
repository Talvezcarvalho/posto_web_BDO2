package br.edu.utfpr.td.tsi.DAO;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EspecialidadeEntity;
import br.edu.utfpr.td.tsi.MODELO.Especialidade;

public interface EspecialidadeDAO {
    public void inserir(Especialidade especialidade);

    public void atualizar(Long id, Especialidade especialidade);

    public void remover(Long id);

    public java.util.List<Especialidade> listarTodos();

    public Especialidade procurarPorId(Long id);


    
}
