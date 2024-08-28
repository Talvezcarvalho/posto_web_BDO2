package br.edu.utfpr.td.tsi.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.edu.utfpr.td.tsi.MODELO.Bairro;

@Repository
@Transactional
public class BairroDAOImpl implements BairroDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void inserir(Bairro bairro) {
        entityManager.persist(bairro);
    }

    @Override
    public void atualizar(Long id, Bairro bairro) {
        Bairro bairroExistente = entityManager.find(Bairro.class, id);
        if (bairroExistente != null) {
            bairroExistente.setNome(bairro.getNome());
            entityManager.merge(bairroExistente);
        }
    }

    @Override
    public void remover(Long id) {
        Bairro bairro = entityManager.find(Bairro.class, id);
        if (bairro != null) {
            entityManager.remove(bairro);
        }
    }

    @Override
    public List<Bairro> listarTodos() {
        TypedQuery<Bairro> query = entityManager.createQuery(
            "SELECT b FROM Bairro b",
            Bairro.class
        );
        return query.getResultList();
    }

    @Override
    public Bairro procurar(Long id) {
        return entityManager.find(Bairro.class, id);
    }
}
