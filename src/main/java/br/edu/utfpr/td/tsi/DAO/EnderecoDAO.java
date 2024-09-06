package br.edu.utfpr.td.tsi.DAO;

import br.edu.utfpr.td.tsi.MODELO.Endereco;

public interface EnderecoDAO {
    public void inserir(Endereco endereco);

    public void atualizar(Long idPaciente, Endereco endereco);

    public void remover(Long idPaciente);

    public Endereco procurar(Long idPaciente);
}
