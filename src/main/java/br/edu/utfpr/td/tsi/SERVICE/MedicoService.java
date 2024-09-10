package br.edu.utfpr.td.tsi.SERVICE;

import java.util.List;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.MedicoEntity;
import br.edu.utfpr.td.tsi.MODELO.Medico;

public interface MedicoService {
    public void cadastrar(Medico medico);

    public List<Medico> listarTodos();

    public void remover(Long id);
    
    // salvar médico
    public void salvarMedico(Medico medico);
}
