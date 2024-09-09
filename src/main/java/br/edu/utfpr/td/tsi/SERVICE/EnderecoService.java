package br.edu.utfpr.td.tsi.SERVICE;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EnderecoEntity;

public interface EnderecoService {
    public void cadastrarEndereco(EnderecoEntity endereco);

    public void removerEndereco(Long idEndereco);

    public void atualizarEndereco(Long idEndereco, EnderecoEntity endereco);

    public EnderecoEntity buscarEndereco(Long idEndereco);
    
}
