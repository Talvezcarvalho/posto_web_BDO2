package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.ConsultaCollection;
import br.edu.utfpr.td.tsi.MODELO.Consulta;

public interface MongoDBConsultaRepository extends MongoRepository<ConsultaCollection, Long> {

    public Consulta findOneById(Long id);
    
}
