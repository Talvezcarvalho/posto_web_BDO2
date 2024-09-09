package br.edu.utfpr.td.tsi.SERVICE;

import javax.transaction.Transactional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.td.tsi.DAO.JPA.JPAEnderecoDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.JPAPacienteDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.PacienteEntity;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private JPAPacienteDAO pacienteDAO;

    @Autowired
    private JPAEnderecoDAO enderecoDAO;

    @Transactional
    public void cadastrar(PacienteEntity paciente) {
        enderecoDAO.inserir(paciente.getEndereco());
        pacienteDAO.inserir(paciente);
    }

    @Override
    public List<PacienteEntity> listarTodos() {
        return pacienteDAO.listarTodos();
    }

    @Override
    public void remover(Long id) {
        pacienteDAO.remover(id);
    }
}
