package br.edu.utfpr.td.tsi.SERVICE;

import br.edu.utfpr.td.tsi.MODELO.Paciente;
import java.util.List;


public interface PacienteService {

    public void cadastrar(Paciente paciente);
    
    public List<Paciente> listarTodos();

    public void remover(Long id);


} 

