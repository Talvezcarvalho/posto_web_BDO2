package br.edu.utfpr.td.tsi.SERVICE;

import br.edu.utfpr.td.tsi.MODELO.Medico;

public interface MedicoService {
    public void cadastrar(Medico medico);

    public java.util.List<Medico> listarTodos();

    public void remover(Long id);
}
