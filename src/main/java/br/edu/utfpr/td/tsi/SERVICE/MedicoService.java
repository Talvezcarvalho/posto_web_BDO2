package br.edu.utfpr.td.tsi.SERVICE;

import java.util.List;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.MedicoEntity;

public interface MedicoService {
    public void cadastrar(MedicoEntity medico);

    public List<MedicoEntity> listarTodos();

    public void remover(Long id);
    
    // salvar médico
    public void salvarMedico(MedicoEntity medico);
}
