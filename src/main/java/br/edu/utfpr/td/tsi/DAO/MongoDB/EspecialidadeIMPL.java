package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.utfpr.td.tsi.MODELO.Especialidade;

public class EspecialidadeIMPL implements EspecialidadeDAO {

    @Autowired
    MongoDBEspecialidadeRepository especialidadeRepository;

    @Override
    public void inserir(Especialidade especialidade) {
        especialidadeRepository.save(especialidade);
    }
    
}
