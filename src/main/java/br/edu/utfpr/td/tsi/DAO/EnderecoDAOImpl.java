package br.edu.utfpr.td.tsi.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.edu.utfpr.td.tsi.MODELO.Endereco;
import br.edu.utfpr.td.tsi.MODELO.Paciente;

@Repository
@Transactional
public class EnderecoDAOImpl implements EnderecoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void inserir(Endereco endereco, String idPaciente) {
        Paciente paciente = entityManager.find(Paciente.class, idPaciente);
        if (paciente != null) {
            endereco.setPaciente(paciente);
            entityManager.persist(endereco);
            paciente.setEndereco(endereco);
            entityManager.merge(paciente);
        }
    }

    @Override
    public void atualizar(String idPaciente, Endereco endereco) {
        Paciente paciente = entityManager.find(Paciente.class, idPaciente);
        if (paciente != null && paciente.getEndereco() != null) {
            Endereco enderecoExistente = paciente.getEndereco();
            enderecoExistente.setLogradouro(endereco.getLogradouro());
            enderecoExistente.setNumero(endereco.getNumero());
            enderecoExistente.setCep(endereco.getCep());
            enderecoExistente.setBairro(endereco.getBairro());
            entityManager.merge(enderecoExistente);
        }
    }

    @Override
    public void remover(String idPaciente) {
        Paciente paciente = entityManager.find(Paciente.class, idPaciente);
        if (paciente != null && paciente.getEndereco() != null) {
            Endereco endereco = paciente.getEndereco();
            paciente.setEndereco(null);
            entityManager.merge(paciente);
            entityManager.remove(endereco);
        }
    }

    @Override
    public Endereco procurar(String idPaciente) {
        Paciente paciente = entityManager.find(Paciente.class, idPaciente);
        return (paciente != null) ? paciente.getEndereco() : null;
    }
}
