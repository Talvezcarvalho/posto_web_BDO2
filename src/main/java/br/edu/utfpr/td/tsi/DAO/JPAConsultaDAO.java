package br.edu.utfpr.td.tsi.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.utfpr.td.tsi.MODELO.Consulta;

public class JPAConsultaDAO implements ConsultaDAO {
    

    @Autowired
    ConsultaRepository consultaRepository;

    @Override
    public void inserir(Consulta consulta) {
        consultaRepository.save(consulta);
    }

    @Override
    public void atualizar(Long idConsulta, Consulta consulta) {
        consultaRepository.save(consulta);
    }

    @Override
    public void remover(Long idConsulta) {
        consultaRepository.deleteById(idConsulta);
    }

    @Override
    public Consulta procurar(Long idConsulta) {
        return consultaRepository.findById(idConsulta).get();
    }
    
}
