package br.edu.utfpr.td.tsi.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.utfpr.td.tsi.MODELO.Endereco;

public class JPAEnderecoDAO implements EnderecoDAO {
    
    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    public void inserir(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    @Override
    public void atualizar(String idPaciente, Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    @Override
    public void remover(String idPaciente) {
        enderecoRepository.deleteById(idPaciente);
    }
    
    @Override
    public Endereco procurar(String idPaciente) {
        return enderecoRepository.findById(idPaciente).get();
    }
}
