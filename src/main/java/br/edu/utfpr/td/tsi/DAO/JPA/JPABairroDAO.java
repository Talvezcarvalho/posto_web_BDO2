package br.edu.utfpr.td.tsi.DAO.JPA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.BairroDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.BairroEntity;
import br.edu.utfpr.td.tsi.MODELO.Bairro;

@Repository("JpaBairroDAO")
public class JPABairroDAO implements BairroDAO {
    
    @Autowired 
    BairroRepository bairroRepository;

    @Override
    public void inserir(Bairro bairro) {
        bairroRepository.save(new BairroEntity(bairro));
    }

    @Override
    public java.util.List<Bairro> listarTodos() {
        List<Bairro> bairros = new ArrayList<Bairro>();
		Iterable<BairroEntity> iterable = bairroRepository.findAll();
		for (BairroEntity bairroEntity : iterable) {
			Bairro bairro = bairroEntity.converterParaModelo();
			bairros.add(bairro);
		}
		return bairros;
    }

    @Override
    public void remover(Long idBairro) {
        bairroRepository.deleteById(idBairro);
    }

    @Override
    public BairroEntity procurar(Long idBairro) {
        return bairroRepository.findById(idBairro).get();
    }

    @Override
    public void atualizar(Long id, Bairro bairro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    
    
}
