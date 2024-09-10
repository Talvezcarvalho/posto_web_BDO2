package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.ConsultaCollection;

public interface MongoDBConsultaRepository extends MongoRepository<ConsultaCollection, String> {

    public ConsultaCollection findByIdConsulta(String idConsulta);
    
}
