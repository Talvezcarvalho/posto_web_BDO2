package br.edu.utfpr.td.tsi.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.MODELO.Bairro;

@Repository
public class JPABairroDAO implements BairroDAO {
    
    @Autowired 
    BairroRepository bairroRepository;

    @Override
    public void inserir(Bairro bairro) {
        bairroRepository.save(bairro);
    }

    @Override
    public java.util.List<Bairro> listarTodos() {
        return (java.util.List<Bairro>) bairroRepository.findAll();
    }

    @Override
    public void atualizar(Long idBairro, Bairro bairro) {
        bairroRepository.save(bairro);
    }

    @Override
    public void remover(Long idBairro) {
        bairroRepository.deleteById(idBairro);
    }

    @Override
    public Bairro procurar(Long idBairro) {
        return bairroRepository.findById(idBairro).get();
    }

    
    
}
