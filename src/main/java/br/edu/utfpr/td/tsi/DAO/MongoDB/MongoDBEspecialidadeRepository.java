package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.EspecialidadeCollection;

public interface MongoDBEspecialidadeRepository extends MongoRepository<EspecialidadeCollection, String> {

    public EspecialidadeCollection findByIdEspecialidade(String idEspecialidade);
    
}
