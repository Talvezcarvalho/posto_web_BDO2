package br.edu.utfpr.td.tsi.SERVICE;

import javax.transaction.Transactional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.edu.utfpr.td.tsi.DAO.EnderecoDAO;
import br.edu.utfpr.td.tsi.DAO.PacienteDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.JPAEnderecoDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.JPAPacienteDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.PacienteEntity;
import br.edu.utfpr.td.tsi.MODELO.Paciente;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    @Qualifier("JPAPacienteDAO")
    private PacienteDAO pacienteDAO;

    @Autowired
    @Qualifier("JPAEnderecoDAO")
    private EnderecoDAO enderecoDAO;

    @Transactional
    public void cadastrar(Paciente paciente) {
        enderecoDAO.inserir(paciente.getEndereco());
        pacienteDAO.inserir(paciente);
    }

    @Override
    public List<Paciente> listarTodos() {
        return pacienteDAO.listarTodos();
    }

    @Override
    public void remover(Long id) {
        pacienteDAO.remover(id);
    }
}
