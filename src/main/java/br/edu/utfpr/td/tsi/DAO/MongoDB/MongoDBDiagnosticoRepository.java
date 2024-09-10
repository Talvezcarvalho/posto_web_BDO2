package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.DiagnosticoCollection;

public interface MongoDBDiagnosticoRepository extends MongoRepository<DiagnosticoCollection, String> {

    public DiagnosticoCollection findOneByIdDiagnostico(String idDiagnostico);
    
}
