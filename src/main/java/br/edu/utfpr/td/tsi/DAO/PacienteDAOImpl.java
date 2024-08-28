package br.edu.utfpr.td.tsi.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.edu.utfpr.td.tsi.MODELO.Paciente;

@Repository
@Transactional
public class PacienteDAOImpl implements PacienteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void inserir(Paciente p) {
        entityManager.persist(p);
    }

    @Override
    public void atualizar(String id, Paciente p) {
        Paciente pacienteExistente = entityManager.find(Paciente.class, id);
        if (pacienteExistente != null) {
            pacienteExistente.setNome(p.getNome());
            pacienteExistente.setSobrenome(p.getSobrenome());
            pacienteExistente.setDataNascimento(p.getDataNascimento());
            pacienteExistente.setEndereco(p.getEndereco());
            entityManager.merge(pacienteExistente);
        }
    }

    @Override
    public void remover(String id) {
        Paciente paciente = entityManager.find(Paciente.class, id);
        if (paciente != null) {
            entityManager.remove(paciente);
        }
    }

    @Override
    public List<Paciente> listarTodos() {
        TypedQuery<Paciente> query = entityManager.createQuery(
            "SELECT p FROM Paciente p",
            Paciente.class
        );
        return query.getResultList();
    }

    @Override
    public Paciente procurar(String id) {
        return entityManager.find(Paciente.class, id);
    }
}
