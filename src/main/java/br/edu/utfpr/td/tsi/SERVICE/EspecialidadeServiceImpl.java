package br.edu.utfpr.td.tsi.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.td.tsi.DAO.JPAEspecialidadeDAO;
import br.edu.utfpr.td.tsi.MODELO.Especialidade;

@Service
public class EspecialidadeServiceImpl implements EspecialidadeService {

    @Autowired
    private JPAEspecialidadeDAO especialidadeDAO;
    
    @Override
    public void cadastrar (Especialidade especialidade) {
        especialidadeDAO.inserir(especialidade);
    }
    @Override
    public java.util.List<Especialidade> listarTodos() {
        return especialidadeDAO.listarTodos();
    }
    @Override
    public void remover(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }
    

}
