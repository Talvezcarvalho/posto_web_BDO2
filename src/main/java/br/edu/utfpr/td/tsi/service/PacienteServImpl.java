package br.edu.utfpr.td.tsi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.utfpr.td.tsi.DAO.EnderecoDAO;
import br.edu.utfpr.td.tsi.DAO.PacienteDAO;
import br.edu.utfpr.td.tsi.MODELO.Paciente;

@Service
public class PacienteServImpl implements PacienteService  {
    
    @Autowired
    private PacienteDAO pacienteDAO;

    @Autowired
    private EnderecoDAO enderecoDAO;

    @Transactional
    public void cadastrar(Paciente p) {
        String idpaciente =UUID.randomUUID().toString();
        p.setId(idpaciente);

        pacienteDAO.inserir(p);
        enderecoDAO.inserir(p.getEndereco(), p.getId());
    }

    @Override
    public List<Paciente> listarTodos() {
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes.addAll(pacienteDAO.listarTodos());
        return pacientes;
    }

    @Override
    public void remover(String idPaciente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public void alterar(Paciente p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

}
