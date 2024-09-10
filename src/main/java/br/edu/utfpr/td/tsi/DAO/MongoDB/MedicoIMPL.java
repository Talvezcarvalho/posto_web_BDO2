package br.edu.utfpr.td.tsi.DAO.MongoDB;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.utfpr.td.tsi.DAO.MedicoDAO;
import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.MedicoCollection;
import br.edu.utfpr.td.tsi.DAO.MongoDB.colecoes.PacienteCollection;
import br.edu.utfpr.td.tsi.MODELO.Medico;
import br.edu.utfpr.td.tsi.MODELO.Paciente;

public class MedicoIMPL implements MedicoDAO  {
    
    @Autowired
    private MongoDBMedicoRepository medicoRepository;

    @Override
    public void inserir(Medico medico) {
        medicoRepository.save(new MedicoCollection(medico));
    }

    @Override
    public void remover(Long id) {
        medicoRepository.deleteById(id);
    }

    @Override
    public List<Medico> listarTodos() {
        List<Medico> lista = new ArrayList<Medico>();
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
        Medico medico = medicoRepository.findById(id).get().converterParaModelo();
        return medico;
    }
}
