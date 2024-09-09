package br.edu.utfpr.td.tsi.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.utfpr.td.tsi.DAO.JPA.JPAEnderecoDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EnderecoEntity;

public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private JPAEnderecoDAO enderecoDAO;

    @Override
    public void cadastrarEndereco(EnderecoEntity endereco) {
        enderecoDAO.inserir(endereco);
    }

    @Override
    public void removerEndereco(Long idEndereco) {
        enderecoDAO.remover(idEndereco);        
    }

    @Override
    public void atualizarEndereco(Long idEndereco, EnderecoEntity endereco) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public EnderecoEntity buscarEndereco(Long idEndereco) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
