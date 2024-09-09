package br.edu.utfpr.td.tsi.DAO.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.BairroDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.BairroEntity;

@Repository
public class JPABairroDAO implements BairroDAO {
    
    @Autowired 
    BairroRepository bairroRepository;

    @Override
    public void inserir(BairroEntity bairro) {
        bairroRepository.save(bairro);
    }

    @Override
    public java.util.List<BairroEntity> listarTodos() {
        return (java.util.List<BairroEntity>) bairroRepository.findAll();
    }

    @Override
    public void atualizar(Long idBairro, BairroEntity bairro) {
        bairroRepository.save(bairro);
    }

    @Override
    public void remover(Long idBairro) {
        bairroRepository.deleteById(idBairro);
    }

    @Override
    public BairroEntity procurar(Long idBairro) {
        return bairroRepository.findById(idBairro).get();
    }

    
    
}
