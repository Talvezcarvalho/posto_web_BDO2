package br.edu.utfpr.td.tsi.SERVICE;

import br.edu.utfpr.td.tsi.DAO.MedicoDAO;
import br.edu.utfpr.td.tsi.MODELO.Medico;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class MedicoService {

    private final MedicoDAO medicoDAO;

    public MedicoService(MedicoDAO medicoDAO) {
        this.medicoDAO = medicoDAO;
    }

    public void salvarMedico(Medico medico) {
        medico.setEspecialidades(Collections.singletonList("ROLE_MEDICO"));
        medicoDAO.inserir(medico);
    }
}