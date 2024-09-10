package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.PacienteCollection;
import br.edu.utfpr.td.tsi.MODELO.Paciente;

public interface MongoDBPacienteRepository extends MongoRepository<PacienteCollection, String> {

    public Paciente findOneById(String id);
    
}
