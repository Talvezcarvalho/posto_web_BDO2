package br.edu.utfpr.td.tsi.DAO.JPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.EnderecoDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EnderecoEntity;
import br.edu.utfpr.td.tsi.MODELO.Endereco;

@Repository

public class JPAEnderecoDAO implements EnderecoDAO {
    
    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    public void inserir(Endereco endereco) {
        EnderecoEntity enderecoEntity = new EnderecoEntity(endereco);
        enderecoRepository.save(enderecoEntity);
    }
    @Override
    public void remover(Long idPaciente) {
        enderecoRepository.deleteById(idPaciente);
    }
    
    @Override
    public Endereco procurar(Long idPaciente) {
        return enderecoRepository.findById(idPaciente).get().converterParaModelo();
    }
    @Override
    public void atualizar(Long idPaciente, Endereco endereco) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }
    @Override
    public List<Endereco> listarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodos'");
    }
}
