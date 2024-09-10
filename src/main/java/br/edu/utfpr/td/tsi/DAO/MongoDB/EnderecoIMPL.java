package br.edu.utfpr.td.tsi.DAO.MongoDB;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.utfpr.td.tsi.DAO.EnderecoDAO;
import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.EnderecoCollection;
import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.PacienteCollection;
import br.edu.utfpr.td.tsi.MODELO.Endereco;
import br.edu.utfpr.td.tsi.MODELO.Paciente;

public class EnderecoIMPL implements EnderecoDAO {
    
    @Autowired
    MongoDBEnderecoRepository enderecoRepository;

    @Override
    public void inserir(Endereco endereco) {
        enderecoRepository.save(new EnderecoCollection(endereco));
    }

    @Override
    public void remover(Long id) {
        enderecoRepository.deleteById(id);
    }

    @Override
    public List<Endereco> listarTodos() {
       List<Endereco> lista = new ArrayList<Endereco>();
		Iterable<EnderecoCollection> endereco = enderecoRepository.findAll();
		for (EnderecoCollection enderecoCollection : endereco) {
			lista.add(enderecoCollection.converterParaModelo());
		}

		return lista;
    }

    @Override
    public void atualizar(Long idPaciente, Endereco endereco) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public Endereco procurar(Long idPaciente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'procurar'");
    }


}
