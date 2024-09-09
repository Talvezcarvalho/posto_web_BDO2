package br.edu.utfpr.td.tsi.DAO.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.EnderecoDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EnderecoEntity;

@Repository
public class JPAEnderecoDAO implements EnderecoDAO {
    
    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    public void inserir(EnderecoEntity endereco) {
        enderecoRepository.save(endereco);
    }

    @Override
    public void atualizar(Long idPaciente, EnderecoEntity endereco) {
        enderecoRepository.save(endereco);
    }

    @Override
    public void remover(Long idPaciente) {
        enderecoRepository.deleteById(idPaciente);
    }
    
    @Override
    public EnderecoEntity procurar(Long idPaciente) {
        return enderecoRepository.findById(idPaciente).get();
    }
}
