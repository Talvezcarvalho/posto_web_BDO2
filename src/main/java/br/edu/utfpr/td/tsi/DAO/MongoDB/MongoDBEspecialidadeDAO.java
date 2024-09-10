package br.edu.utfpr.td.tsi.DAO.MongoDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.utfpr.td.tsi.DAO.EspecialidadeDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EspecialidadeEntity;
import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.EspecialidadeCollection;
import br.edu.utfpr.td.tsi.MODELO.Especialidade;

public class MongoDBEspecialidadeDAO implements EspecialidadeDAO {

    @Autowired
    MongoDBEspecialidadeRepository especialidadeRepository;

    @Override
    public void inserir(Especialidade especialidade) {
        especialidadeRepository.save(new EspecialidadeCollection());
    }

    @Override
    public void atualizar(Long id, Especialidade especialidade) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void remover(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public List<Especialidade> listarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodos'");
    }

    @Override
    public EspecialidadeEntity procurarPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'procurarPorId'");
    }
    
}
