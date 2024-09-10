package br.edu.utfpr.td.tsi.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.td.tsi.DAO.MedicoDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.JPAMedicoDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.MedicoEntity;
import br.edu.utfpr.td.tsi.MODELO.Medico;

@Service
public class MedicoServiceImpl implements MedicoService { 

    @Autowired
    private MedicoDAO medicoDAO;

    @Override
    public void cadastrar(Medico medico) {
        medicoDAO.inserir(medico);
    }

    @Override
    public java.util.List<Medico> listarTodos() {
        return medicoDAO.listarTodos();
    }

    @Override
    public void remover(Long id) {
        medicoDAO.remover(id);
    }

    @Override
    public void salvarMedico(Medico medico) {
        medicoDAO.inserir(medico);
    }
}
