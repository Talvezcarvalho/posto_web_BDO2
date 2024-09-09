package br.edu.utfpr.td.tsi.DAO.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.ConsultaDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.ConsultaEntity;

@Repository
public class JPAConsultaDAO implements ConsultaDAO {
    

    @Autowired
    ConsultaRepository consultaRepository;

    @Override
    public void inserir(ConsultaEntity consulta) {
        consultaRepository.save(consulta);
    }

    @Override
    public void atualizar(Long idConsulta, ConsultaEntity consulta) {
        consultaRepository.save(consulta);
    }

    @Override
    public void remover(Long idConsulta) {
        consultaRepository.deleteById(idConsulta);
    }

    @Override
    public ConsultaEntity procurar(Long idConsulta) {
        return consultaRepository.findById(idConsulta).get();
    }

}
