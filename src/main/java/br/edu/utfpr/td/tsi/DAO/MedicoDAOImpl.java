package br.edu.utfpr.td.tsi.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.edu.utfpr.td.tsi.MODELO.Medico;

@Repository
@Transactional
public class MedicoDAOImpl implements MedicoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void inserir(Medico medico) {
        entityManager.persist(medico);
    }

    @Override
    public void atualizar(Long id, Medico medico) {
        Medico medicoExistente = entityManager.find(Medico.class, id);
        if (medicoExistente != null) {
            medicoExistente.setCrm(medico.getCrm());
            medicoExistente.setNome(medico.getNome());
            medicoExistente.setEmail(medico.getEmail());
            medicoExistente.setSenha(medico.getSenha());
            medicoExistente.setEspecialidades(medico.getEspecialidades());
            entityManager.merge(medicoExistente);
        }
    }

    @Override
    public void remover(Long id) {
        Medico medico = entityManager.find(Medico.class, id);
        if (medico != null) {
            entityManager.remove(medico);
        }
    }

    @Override
    public List<Medico> listarTodos() {
        TypedQuery<Medico> query = entityManager.createQuery(
            "SELECT m FROM Medico m",
            Medico.class
        );
        return query.getResultList();
    }

    @Override
    public Medico procurarPorId(Long id) {
        return entityManager.find(Medico.class, id);
    }

    @Override
    public Medico procurarPorCrm(String crm) {
        TypedQuery<Medico> query = entityManager.createQuery(
            "SELECT m FROM Medico m WHERE m.crm = :crm",
            Medico.class
        );
        query.setParameter("crm", crm);
        List<Medico> resultados = query.getResultList();
        return resultados.isEmpty() ? null : resultados.get(0);
    }

    @Override
    public Medico procurarPorEmail(String email) {
        TypedQuery<Medico> query = entityManager.createQuery(
            "SELECT m FROM Medico m WHERE m.email = :email",
            Medico.class
        );
        query.setParameter("email", email);
        List<Medico> resultados = query.getResultList();
        return resultados.isEmpty() ? null : resultados.get(0);
    }
}
