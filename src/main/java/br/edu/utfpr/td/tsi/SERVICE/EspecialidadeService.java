package br.edu.utfpr.td.tsi.SERVICE;

import br.edu.utfpr.td.tsi.MODELO.Especialidade;

public interface EspecialidadeService {
    public void cadastrar(Especialidade especialidade);
    
    public java.util.List<Especialidade> listarTodos();

    public void remover(Long id);
}
