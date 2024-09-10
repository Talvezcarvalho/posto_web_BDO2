package br.edu.utfpr.td.tsi.SERVICE;

import java.util.List;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EspecialidadeEntity;
import br.edu.utfpr.td.tsi.MODELO.Especialidade;

public interface EspecialidadeService {
    public void cadastrar(Especialidade especialidade);
    
    public List<Especialidade> listarTodos();

    public void remover(Long id);
}
