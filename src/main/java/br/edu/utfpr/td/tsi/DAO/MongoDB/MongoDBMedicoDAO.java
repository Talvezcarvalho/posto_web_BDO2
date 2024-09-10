package br.edu.utfpr.td.tsi.DAO.MongoDB;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.td.tsi.DAO.MedicoDAO;
import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.MedicoCollection;
import br.edu.utfpr.td.tsi.MODELO.Medico;

@Repository
public class MongoDBMedicoDAO implements MedicoDAO {

    @Autowired
    private MongoDBMedicoRepository medicoRepository;

    @Override
    public void inserir(Medico medico) {
        medicoRepository.save(new MedicoCollection(medico));
    }

    @Override
    public void remover(Long id) {
        medicoRepository.deleteById(id.toString()); // Converte Long para String
    }

    @Override
    public List<Medico> listarTodos() {
        List<Medico> lista = new ArrayList<>();
        Iterable<MedicoCollection> medicos = medicoRepository.findAll();
        for (MedicoCollection medicoCollection : medicos) {
            lista.add(medicoCollection.converterParaModelo());
        }
        return lista;
    }

    @Override
    public void atualizar(Long id, Medico medico) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public Medico procurarPorId(Long id) {
        // Converte Long para String e busca o médico
        MedicoCollection medicoCollection = medicoRepository.findById(id.toString()).orElse(null);
        return (medicoCollection != null) ? medicoCollection.converterParaModelo() : null;
    }
}
