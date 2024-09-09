package br.edu.utfpr.td.tsi.DAO.JPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.PacienteDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.PacienteEntity;

@Repository
public class JPAPacienteDAO implements PacienteDAO {
    
    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public void inserir(PacienteEntity paciente) {
        pacienteRepository.save(paciente);
    }

    @Override
    public List<PacienteEntity> listarTodos() {
        return (List<PacienteEntity>) pacienteRepository.findAll();
    }

    @Override
    public void remover(Long id) {
        pacienteRepository.deleteById(id);
    }
}
