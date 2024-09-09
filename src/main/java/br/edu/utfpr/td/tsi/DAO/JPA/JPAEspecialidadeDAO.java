package br.edu.utfpr.td.tsi.DAO.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.EspecialidadeDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EspecialidadeEntity;


@Repository
public class JPAEspecialidadeDAO implements EspecialidadeDAO {
    
    @Autowired
    private EspecialidadeRepository especialidadeRepository;

    @Override
    public void inserir(EspecialidadeEntity especialidade) {
        especialidadeRepository.save(especialidade);
    }

    @Override
    public void atualizar(Long idEspecialidade, EspecialidadeEntity especialidade) {
        especialidadeRepository.save(especialidade);
    }

    @Override
    public void remover(Long idEspecialidade) {
        especialidadeRepository.deleteById(idEspecialidade);
    }

    @Override
    public EspecialidadeEntity procurarPorId(Long idEspecialidade) {
        return especialidadeRepository.findById(idEspecialidade).get();
    }

    @Override
    public java.util.List<EspecialidadeEntity> listarTodos() {
        return (java.util.List<EspecialidadeEntity>) especialidadeRepository.findAll();
    }
}
