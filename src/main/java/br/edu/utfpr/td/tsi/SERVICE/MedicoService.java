package br.edu.utfpr.td.tsi.SERVICE;

import br.edu.utfpr.td.tsi.DAO.MedicoDAO;
import br.edu.utfpr.td.tsi.MODELO.Medico;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class MedicoService {

    private final MedicoDAO medicoDAO;
    private final PasswordEncoder passwordEncoder;

    public MedicoService(MedicoDAO medicoDAO, PasswordEncoder passwordEncoder) {
        this.medicoDAO = medicoDAO;
        this.passwordEncoder = passwordEncoder;
    }

    public void salvarMedico(Medico medico) {
        medico.setSenha(passwordEncoder.encode(medico.getSenha()));
        medico.setEspecialidades(Collections.singletonList("ROLE_MEDICO"));
        medicoDAO.inserir(medico);
    }
}