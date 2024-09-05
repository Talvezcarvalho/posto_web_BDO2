package br.edu.utfpr.td.tsi.DAO;

import org.springframework.data.repository.CrudRepository;

import br.edu.utfpr.td.tsi.MODELO.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, String> {
    
}
