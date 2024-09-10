package br.edu.utfpr.td.tsi.DAO.JPA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.PacienteDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.PacienteEntity;
import br.edu.utfpr.td.tsi.MODELO.Paciente;

@Repository
public class JPAPacienteDAO implements PacienteDAO {
    
    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public void inserir(Paciente paciente) {
        PacienteEntity pacienteEntity = new PacienteEntity(paciente);
        pacienteRepository.save(pacienteEntity);
    }

    @Override
    public List<Paciente> listarTodos() {
        List<Paciente> lista = new ArrayList<Paciente>();

		Iterable<PacienteEntity> pacientes = pacienteRepository.findAll();	
		for (PacienteEntity pacienteEntity : pacientes) {
			Paciente paciente = pacienteEntity.converterParaModelo();
			lista.add(paciente);
		}
		return lista;
    }

    @Override
    public void remover(Long id) {
        pacienteRepository.deleteById(id);
    }
}
