package br.edu.utfpr.td.tsi.SERVICE;

import br.edu.utfpr.td.tsi.MODELO.Especialidade;
import java.util.List;

public interface EspecialidadeService {
    public void cadastrar(Especialidade especialidade);
    
    public List<Especialidade> listarTodos();

    public void remover(Long id);
}
