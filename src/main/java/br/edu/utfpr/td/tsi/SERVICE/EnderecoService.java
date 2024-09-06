package br.edu.utfpr.td.tsi.SERVICE;

import br.edu.utfpr.td.tsi.MODELO.Endereco;

public interface EnderecoService {
    public void cadastrarEndereco(Endereco endereco);

    public void removerEndereco(Long idEndereco);

    public void atualizarEndereco(Long idEndereco, Endereco endereco);

    public Endereco buscarEndereco(Long idEndereco);
    
}
