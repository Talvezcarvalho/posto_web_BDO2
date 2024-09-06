package br.edu.utfpr.td.tsi.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.utfpr.td.tsi.MODELO.Medico;

public class JPAMedicoDAO implements MedicoDAO{
    
    @Autowired
    MedicoRepository medicoRepository;

    @Override
    public void inserir(Medico medico) {
        medicoRepository.save(medico);
    }

    @Override
    public void atualizar(String id, Medico medico) {
        medicoRepository.deleteById(id);
    }

    @Override
    public void remover(String id) {
        medicoRepository.deleteById(id);
    }

    @Override
    public java.util.List<Medico> listarTodos() {
        return (java.util.List<Medico>) medicoRepository.findAll();
    }

    @Override
    public Medico procurarPorId(String id) {
        return medicoRepository.findById(id).get();
    }
}
