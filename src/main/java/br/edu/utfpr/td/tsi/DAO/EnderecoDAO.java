package br.edu.utfpr.td.tsi.DAO;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EnderecoEntity;

public interface EnderecoDAO {
    public void inserir(EnderecoEntity endereco);

    public void atualizar(Long idPaciente, EnderecoEntity endereco);

    public void remover(Long idPaciente);

    public EnderecoEntity procurar(Long idPaciente);
}
