package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.BairroCollection;
import br.edu.utfpr.td.tsi.MODELO.Bairro;

public interface MongoDBBairroRepository extends MongoRepository<BairroCollection, Long> {

	public Bairro findOneById(Long id);

}