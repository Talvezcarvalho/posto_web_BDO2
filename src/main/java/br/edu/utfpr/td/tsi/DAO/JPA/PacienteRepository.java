package br.edu.utfpr.td.tsi.DAO.JPA;

import org.springframework.data.repository.CrudRepository;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.PacienteEntity;

public interface PacienteRepository extends CrudRepository<PacienteEntity, Long> {
    
}
