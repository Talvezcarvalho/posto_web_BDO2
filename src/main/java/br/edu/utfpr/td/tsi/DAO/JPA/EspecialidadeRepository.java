package br.edu.utfpr.td.tsi.DAO.JPA;

import org.springframework.data.repository.CrudRepository;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EspecialidadeEntity;

public interface EspecialidadeRepository extends CrudRepository<EspecialidadeEntity, Long> {
    
}
