package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.DiagnosticoCollection;
import br.edu.utfpr.td.tsi.MODELO.Diagnostico;

public interface MongoDBDiagnosticoRepository extends MongoRepository<DiagnosticoCollection, String> {

    public Diagnostico findOneById(String id);
    
}
