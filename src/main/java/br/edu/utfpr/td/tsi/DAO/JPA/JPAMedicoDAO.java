package br.edu.utfpr.td.tsi.DAO.JPA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.MedicoDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.MedicoEntity;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.PacienteEntity;
import br.edu.utfpr.td.tsi.MODELO.Medico;
import br.edu.utfpr.td.tsi.MODELO.Paciente;


@Repository

public class JPAMedicoDAO implements MedicoDAO{
    
    @Autowired
    MedicoRepository medicoRepository;

    @Override
    public void inserir(Medico medico) {
        MedicoEntity medicoEntity = new MedicoEntity(medico);
        medicoRepository.save(medicoEntity);
    }


    @Override
    public void remover(Long id) {
        medicoRepository.deleteById(id);
    }

    @Override
    public List<Medico> listarTodos() {
         List<Medico> lista = new ArrayList<Medico>();

		Iterable<MedicoEntity> medicos = medicoRepository.findAll();	
		for (MedicoEntity medicoEntity : medicos) {
			Medico medico = medicoEntity.converterParaModelo();
			lista.add(medico);
		}
		return lista;
    }

    @Override
    public Medico procurarPorId(Long id) {
        return medicoRepository.findById(id).get().converterParaModelo();
    }


    @Override
    public void atualizar(Long id, Medico medico) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }
}
