package br.edu.utfpr.td.tsi.SERVICE;

import java.util.List;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EspecialidadeEntity;

public interface EspecialidadeService {
    public void cadastrar(EspecialidadeEntity especialidade);
    
    public List<EspecialidadeEntity> listarTodos();

    public void remover(Long id);
}
