package br.edu.utfpr.td.tsi.service;

import java.util.List;

import br.edu.utfpr.td.tsi.MODELO.Paciente;

public interface PacienteService {
    
    public void cadastrar(Paciente p); 

    public List<Paciente> listarTodos();

    public void remover(String idPaciente);

    public void alterar(Paciente p);

}
