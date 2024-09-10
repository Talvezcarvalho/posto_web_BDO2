package br.edu.utfpr.td.tsi.SERVICE;

import java.util.List;

import br.edu.utfpr.td.tsi.MODELO.Paciente;


public interface PacienteService {

    public void cadastrar(Paciente paciente);
    
    public List<Paciente> listarTodos();

    public void remover(Long id);


} 

