package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.GravidadeCollection;
import br.edu.utfpr.td.tsi.MODELO.Gravidade;

public interface MongoDBGravidadeRepository extends MongoRepository<GravidadeCollection, String> {

    public GravidadeCollection findOneByIdGravidade(String idGravidade);
    
}
