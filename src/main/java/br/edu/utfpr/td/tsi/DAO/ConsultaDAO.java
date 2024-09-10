package br.edu.utfpr.td.tsi.DAO;

import br.edu.utfpr.td.tsi.MODELO.Consulta;

public interface ConsultaDAO {
    public void inserir(Consulta consulta);

    public void atualizar(Long idConsulta, String situacao);

    public void remover(Long idConsulta);

    public Consulta procurar(Long idConsulta);
}
