package br.edu.utfpr.td.tsi.DAO.MongoDB;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.EnderecoDAO;
import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.EnderecoCollection;
import br.edu.utfpr.td.tsi.MODELO.Endereco;

@Repository
public class MongoDBEnderecoDAO implements EnderecoDAO {

    @Autowired
    private MongoDBEnderecoRepository enderecoRepository;

    @Override
    public void inserir(Endereco endereco) {
        enderecoRepository.save(new EnderecoCollection(endereco));
    }

    @Override
    public void remover(Long id) {
        enderecoRepository.deleteById(id.toString()); 
    }

    @Override
    public List<Endereco> listarTodos() {
        List<Endereco> lista = new ArrayList<>();
        Iterable<EnderecoCollection> enderecoIterable = enderecoRepository.findAll();
        for (EnderecoCollection enderecoCollection : enderecoIterable) {
            lista.add(enderecoCollection.converterParaModelo());
        }
        return lista;
    }

    @Override
    public void atualizar(Long id, Endereco endereco) {
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public Endereco procurar(Long id) {
        EnderecoCollection enderecoCollection = enderecoRepository.findById(id.toString()).orElse(null);
        return (enderecoCollection != null) ? enderecoCollection.converterParaModelo() : null;
    }
}
