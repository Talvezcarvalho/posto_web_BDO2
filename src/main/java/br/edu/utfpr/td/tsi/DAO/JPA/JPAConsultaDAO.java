package br.edu.utfpr.td.tsi.DAO.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.ConsultaDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.ConsultaEntity;
import br.edu.utfpr.td.tsi.MODELO.Consulta;

@Repository
public class JPAConsultaDAO implements ConsultaDAO {
    

    @Autowired
    ConsultaRepository consultaRepository;

    @Override
    public void inserir(Consulta consulta) {
        ConsultaEntity consultaEntity = new ConsultaEntity(consulta);
        consultaRepository.save(consultaEntity);
    }

    @Override
    public void atualizar(Long idConsulta, String novaSituacao) {
        ConsultaEntity consultaEntity = consultaRepository.findById(idConsulta).get();
        consultaEntity.setSituacao(novaSituacao);
        consultaRepository.save(consultaEntity);
    }

    @Override
    public void remover(Long idConsulta) {
        consultaRepository.deleteById(idConsulta);
    }

    @Override
    public Consulta procurar(Long idConsulta) {
        return consultaRepository.findById(idConsulta).get().converterParaModelo();
    }

    

}
