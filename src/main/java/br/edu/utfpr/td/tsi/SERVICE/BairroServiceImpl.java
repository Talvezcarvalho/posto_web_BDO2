package br.edu.utfpr.td.tsi.SERVICE;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.td.tsi.DAO.JPABairroDAO;
import br.edu.utfpr.td.tsi.MODELO.Bairro;

@Service
public class BairroServiceImpl implements BairroService {
    
    @Autowired
    private JPABairroDAO bairroDAO;

    @Override
    public void cadastrarBairro(Bairro bairro) {
        bairroDAO.inserir(bairro);
    }

    @Override
    public void removerBairro(Long idBairro) {
        bairroDAO.remover(idBairro);        
    }

    @Override
    public List<Bairro> listarBairros() {
        return bairroDAO.listarTodos();
    }

}
