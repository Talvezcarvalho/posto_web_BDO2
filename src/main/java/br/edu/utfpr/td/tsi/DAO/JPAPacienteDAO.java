package br.edu.utfpr.td.tsi.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.MODELO.Paciente;

@Repository
public class JPAPacienteDAO implements PacienteDAO {
    
    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public void inserir(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    @Override
    public List<Paciente> listarTodos() {
        return (List<Paciente>) pacienteRepository.findAll();
    }

    @Override
    public void remover(Long id) {
        pacienteRepository.deleteById(id);
    }
}
