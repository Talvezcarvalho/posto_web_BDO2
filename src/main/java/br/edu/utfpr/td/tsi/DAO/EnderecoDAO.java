package br.edu.utfpr.td.tsi.DAO;

import br.edu.utfpr.td.tsi.MODELO.Endereco;

public interface EnderecoDAO {
    public void inserir(Endereco endereco);

    public void atualizar(String idPaciente, Endereco endereco);

    public void remover(String idPaciente);

    public Endereco procurar(String idPaciente);
}
