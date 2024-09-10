package br.edu.utfpr.td.tsi.DAO.MongoDB;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.BairroDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.BairroEntity;
import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.BairroCollection;
import br.edu.utfpr.td.tsi.MODELO.Bairro;

@Repository
public class MongoDBBairroDAO implements BairroDAO {
    
    @Autowired
    private MongoDBBairroRepository repository;

    @Override
    public void inserir(Bairro bairro) {
        repository.save(new BairroCollection(bairro));
    }

    @Override
    public List<Bairro> listarTodos() {
        List<Bairro> bairros = new ArrayList<>();
        Iterable<BairroCollection> iterable = repository.findAll();
        for (BairroCollection bairroCollection : iterable) {
            bairros.add(bairroCollection.converterParaModelo());
        }
        return bairros;
    }

    @Override
    public void remover(Long id) {
        repository.deleteById(id.toString()); // Converte Long para String
    }

    @Override
    public void atualizar(Long id, Bairro bairro) {
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public BairroEntity procurar(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'procurar'");
    }
}
