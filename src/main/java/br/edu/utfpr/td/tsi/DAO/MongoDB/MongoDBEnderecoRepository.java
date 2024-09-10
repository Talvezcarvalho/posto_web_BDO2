package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.EnderecoCollection;
import br.edu.utfpr.td.tsi.MODELO.Endereco;

public interface MongoDBEnderecoRepository extends MongoRepository<EnderecoCollection, String> {

    public Endereco findOneById(String id);
    
}
