package br.edu.utfpr.td.tsi.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.utfpr.td.tsi.DAO.JPAEnderecoDAO;
import br.edu.utfpr.td.tsi.MODELO.Endereco;

public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private JPAEnderecoDAO enderecoDAO;

    @Override
    public void cadastrarEndereco(Endereco endereco) {
        enderecoDAO.inserir(endereco);
    }

    @Override
    public void removerEndereco(Long idEndereco) {
        enderecoDAO.remover(idEndereco);        
    }

    @Override
    public void atualizarEndereco(Long idEndereco, Endereco endereco) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Endereco buscarEndereco(Long idEndereco) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
