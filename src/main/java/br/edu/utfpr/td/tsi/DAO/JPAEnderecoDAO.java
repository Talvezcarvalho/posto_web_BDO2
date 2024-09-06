package br.edu.utfpr.td.tsi.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.MODELO.Endereco;

@Repository
public class JPAEnderecoDAO implements EnderecoDAO {
    
    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    public void inserir(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    @Override
    public void atualizar(Long idPaciente, Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    @Override
    public void remover(Long idPaciente) {
        enderecoRepository.deleteById(idPaciente);
    }
    
    @Override
    public Endereco procurar(Long idPaciente) {
        return enderecoRepository.findById(idPaciente).get();
    }
}
