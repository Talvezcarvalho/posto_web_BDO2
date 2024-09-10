package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.MedicoCollection;
import br.edu.utfpr.td.tsi.MODELO.Medico;

public interface MongoDBMedicoRepository extends MongoRepository<MedicoCollection, String> {

    public Medico findOneById(String id);
    
}
