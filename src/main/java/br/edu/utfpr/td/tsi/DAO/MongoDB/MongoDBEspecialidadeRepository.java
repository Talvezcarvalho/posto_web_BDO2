package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.EspecialidadeCollection;
import br.edu.utfpr.td.tsi.MODELO.Especialidade;

public interface MongoDBEspecialidadeRepository extends MongoRepository<EspecialidadeCollection, Long> {

    public Especialidade findOneById(Long id);
    
}
