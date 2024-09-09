package br.edu.utfpr.td.tsi.DAO;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.ConsultaEntity;

public interface ConsultaDAO {
    public void inserir(ConsultaEntity consulta);

    public void atualizar(Long idConsulta, ConsultaEntity consulta);

    public void remover(Long idConsulta);

    public ConsultaEntity procurar(Long idConsulta);
}
