package br.edu.utfpr.td.tsi.SERVICE;

import java.util.List;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.PacienteEntity;


public interface PacienteService {

    public void cadastrar(PacienteEntity paciente);
    
    public List<PacienteEntity> listarTodos();

    public void remover(Long id);


} 

