package br.edu.utfpr.td.tsi.DAO.JPA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.EspecialidadeDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EspecialidadeEntity;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.MedicoEntity;
import br.edu.utfpr.td.tsi.MODELO.Especialidade;
import br.edu.utfpr.td.tsi.MODELO.Medico;


@Repository

public class JPAEspecialidadeDAO implements EspecialidadeDAO {
    
    @Autowired
    private EspecialidadeRepository especialidadeRepository;

    @Override
    public void inserir(Especialidade especialidade) {
        EspecialidadeEntity especialidadeEntity = new EspecialidadeEntity(especialidade);
        especialidadeRepository.save(especialidadeEntity);
    }

    @Override
    public void remover(Long idEspecialidade) {
        especialidadeRepository.deleteById(idEspecialidade);
    }

    @Override
    public Especialidade procurarPorId(Long idEspecialidade) {
        return especialidadeRepository.findById(idEspecialidade).get().converterParaModelo();
    }

    @Override
    public void atualizar(Long id, Especialidade especialidade) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public List<Especialidade> listarTodos() {
        List<Especialidade> lista = new ArrayList<Especialidade>();

		Iterable<EspecialidadeEntity> especialidades = especialidadeRepository.findAll();	
		for (EspecialidadeEntity especialidadeEntity : especialidades) {
			Especialidade especialidade = especialidadeEntity.converterParaModelo();
			lista.add(especialidade);
		}
		return lista;
    }
}
