package br.edu.utfpr.td.tsi.SERVICE;

import br.edu.utfpr.td.tsi.MODELO.Medico;
import java.util.List;

public interface MedicoService {
    public void cadastrar(Medico medico);

    public List<Medico> listarTodos();

    public void remover(Long id);
    
    // salvar médico
    public void salvarMedico(Medico medico);
}
