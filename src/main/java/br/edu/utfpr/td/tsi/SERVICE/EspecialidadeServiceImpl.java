package br.edu.utfpr.td.tsi.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.td.tsi.DAO.JPA.JPAEspecialidadeDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EspecialidadeEntity;

@Service
public class EspecialidadeServiceImpl implements EspecialidadeService {

    @Autowired
    private JPAEspecialidadeDAO especialidadeDAO;
    
    @Override
    public void cadastrar (EspecialidadeEntity especialidade) {
        especialidadeDAO.inserir(especialidade);
    }
    @Override
    public java.util.List<EspecialidadeEntity> listarTodos() {
        return especialidadeDAO.listarTodos();
    }
    @Override
    public void remover(Long id) {
        especialidadeDAO.remover(id);
    }
    
}
