package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.EnderecoCollection;
import br.edu.utfpr.td.tsi.MODELO.Endereco;

public interface MongoDBEnderecoRepository extends MongoRepository<EnderecoCollection, Long> {

    public Endereco findOneById(Long id);
    
}
