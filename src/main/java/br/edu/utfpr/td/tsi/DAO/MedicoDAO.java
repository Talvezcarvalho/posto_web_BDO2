package br.edu.utfpr.td.tsi.DAO;

import java.util.List;

import br.edu.utfpr.td.tsi.MODELO.Medico;

public interface MedicoDAO {
    void inserir(Medico medico);

    void atualizar(Long id, Medico medico);

    void remover(Long id);

    List<Medico> listarTodos();

    Medico procurarPorId(Long id);

    Medico procurarPorCrm(String crm);

    Medico procurarPorEmail(String email);
}
