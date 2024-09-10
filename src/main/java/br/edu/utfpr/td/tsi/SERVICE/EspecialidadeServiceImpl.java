package br.edu.utfpr.td.tsi.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.td.tsi.DAO.EspecialidadeDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.JPAEspecialidadeDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EspecialidadeEntity;
import br.edu.utfpr.td.tsi.MODELO.Especialidade;

@Service
public class EspecialidadeServiceImpl implements EspecialidadeService {

    @Autowired
    private EspecialidadeDAO especialidadeDAO;
    
    @Override
    public void cadastrar (Especialidade especialidade) {
        especialidadeDAO.inserir(especialidade);
    }
    @Override
    public List<Especialidade> listarTodos() {
        return especialidadeDAO.listarTodos();
    }
    @Override
    public void remover(Long id) {
        especialidadeDAO.remover(id);
    }
    
}
