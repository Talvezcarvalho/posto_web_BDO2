package br.edu.utfpr.td.tsi.DAO.MongoDB;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.utfpr.td.tsi.DAO.PacienteDAO;
import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.PacienteCollection;
import br.edu.utfpr.td.tsi.MODELO.Paciente;

public class PacienteIMPL implements PacienteDAO{
    
    @Autowired
    MongoDBPacienteRepository pacienteRepository;

    @Override
    public void inserir(Paciente paciente) {
        pacienteRepository.save(new PacienteCollection(paciente));
    }
    
    @Override
    public void remover(Long id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public java.util.List<Paciente> listarTodos() {
        List<Paciente> lista = new ArrayList<Paciente>();

		Iterable<PacienteCollection> pacientes = pacienteRepository.findAll();
		for (PacienteCollection pacienteCollection : pacientes) {
			lista.add(pacienteCollection.converterParaModelo());
		}
		return lista;
    }
    
    
}
