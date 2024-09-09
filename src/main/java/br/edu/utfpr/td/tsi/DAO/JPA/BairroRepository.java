package br.edu.utfpr.td.tsi.DAO.JPA;

import org.springframework.data.repository.CrudRepository;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.BairroEntity;

public interface BairroRepository extends CrudRepository<BairroEntity, Long> {
    
}
