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
}