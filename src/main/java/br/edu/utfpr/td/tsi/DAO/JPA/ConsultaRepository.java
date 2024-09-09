package br.edu.utfpr.td.tsi.DAO.JPA;

import org.springframework.data.repository.CrudRepository;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.ConsultaEntity;

public interface ConsultaRepository extends CrudRepository<ConsultaEntity, Long> {
    
}
