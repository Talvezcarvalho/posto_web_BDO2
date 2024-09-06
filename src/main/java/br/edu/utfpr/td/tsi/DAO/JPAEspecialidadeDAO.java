package br.edu.utfpr.td.tsi.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.utfpr.td.tsi.MODELO.Especialidade;

public class JPAEspecialidadeDAO implements EspecialidadeDAO {
    
    @Autowired
    private EspecialidadeRepository especialidadeRepository;

    @Override
    public void inserir(Especialidade especialidade) {
        especialidadeRepository.save(especialidade);
    }

    @Override
    public void atualizar(Long idEspecialidade, Especialidade especialidade) {
        especialidadeRepository.save(especialidade);
    }

    @Override
    public void remover(Long idEspecialidade) {
        especialidadeRepository.deleteById(idEspecialidade);
    }

    @Override
    public Especialidade procurarPorId(Long idEspecialidade) {
        return especialidadeRepository.findById(idEspecialidade).get();
    }

    @Override
    public java.util.List<Especialidade> listarTodos() {
        return (java.util.List<Especialidade>) especialidadeRepository.findAll();
    }
}
