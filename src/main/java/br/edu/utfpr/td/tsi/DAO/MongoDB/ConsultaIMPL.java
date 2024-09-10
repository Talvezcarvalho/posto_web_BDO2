package br.edu.utfpr.td.tsi.DAO.MongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.ConsultaDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.ConsultaRepository;
import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.ConsultaCollection;
import br.edu.utfpr.td.tsi.MODELO.Consulta;

@Repository
public class ConsultaIMPL implements ConsultaDAO {

    @Autowired
    MongoDBConsultaRepository consultaRepository;

    @Override
    public void inserir(Consulta consulta) {
        consultaRepository.save(new ConsultaCollection(consulta));
    }

    @Override
    public void remover(Long id) {
        consultaRepository.deleteById(id);
    }

    @Override
    public Consulta procurar(Long id) {
        return consultaRepository.findById(id).get().converterParaModelo();
    }

    @Override
    public void atualizar(Long idConsulta, Consulta consulta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }
    
    
    
}
