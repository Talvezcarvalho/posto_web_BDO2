package br.edu.utfpr.td.tsi.DAO;

import org.springframework.data.repository.CrudRepository;

import br.edu.utfpr.td.tsi.MODELO.Consulta;

public interface ConsultaRepository extends CrudRepository<Consulta, Long> {
    
}
