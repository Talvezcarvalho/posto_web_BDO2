package br.edu.utfpr.td.tsi.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.utfpr.td.tsi.DAO.JPA.JPAMedicoDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.MedicoEntity;

public class MedicoServiceImpl implements MedicoService { 

    @Autowired
    private JPAMedicoDAO medicoDAO;

    @Override
    public void cadastrar(MedicoEntity medico) {
        medicoDAO.inserir(medico);
    }

    @Override
    public java.util.List<MedicoEntity> listarTodos() {
        return medicoDAO.listarTodos();
    }

    @Override
    public void remover(Long id) {
        medicoDAO.remover(id);
    }

    @Override
    public void salvarMedico(MedicoEntity medico) {
        medicoDAO.inserir(medico);
    }
}
