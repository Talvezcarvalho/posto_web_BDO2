package br.edu.utfpr.td.tsi.SERVICE;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.td.tsi.DAO.JPA.JPABairroDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.BairroEntity;

@Service
public class BairroServiceImpl implements BairroService {
    
    @Autowired
    private JPABairroDAO bairroDAO;

    @Override
    public void cadastrarBairro(BairroEntity bairro) {
        bairroDAO.inserir(bairro);
    }

    @Override
    public void removerBairro(Long idBairro) {
        bairroDAO.remover(idBairro);        
    }

    @Override
    public List<BairroEntity> listarBairros() {
        return bairroDAO.listarTodos();
    }

}
