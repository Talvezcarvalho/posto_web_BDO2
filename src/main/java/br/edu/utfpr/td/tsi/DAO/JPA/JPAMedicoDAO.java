package br.edu.utfpr.td.tsi.DAO.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.MedicoDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.MedicoEntity;


@Repository
public class JPAMedicoDAO implements MedicoDAO{
    
    @Autowired
    MedicoRepository medicoRepository;

    @Override
    public void inserir(MedicoEntity medico) {
        medicoRepository.save(medico);
    }

    @Override
    public void atualizar(Long id, MedicoEntity medico) {
        medicoRepository.deleteById(id);
    }

    @Override
    public void remover(Long id) {
        medicoRepository.deleteById(id);
    }

    @Override
    public java.util.List<MedicoEntity> listarTodos() {
        return (java.util.List<MedicoEntity>) medicoRepository.findAll();
    }

    @Override
    public MedicoEntity procurarPorId(Long id) {
        return medicoRepository.findById(id).get();
    }
}
