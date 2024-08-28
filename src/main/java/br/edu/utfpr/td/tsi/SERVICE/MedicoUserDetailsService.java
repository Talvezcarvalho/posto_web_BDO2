package br.edu.utfpr.td.tsi.SERVICE;

import br.edu.utfpr.td.tsi.DAO.MedicoDAO;
import br.edu.utfpr.td.tsi.MODELO.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MedicoUserDetailsService implements UserDetailsService {

	@Autowired
	private MedicoDAO medicoDAO;


	// Copiei desse lugar  https://www.baeldung.com/spring-security-authentication-with-a-database
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Medico medico = medicoDAO.procurarPorEmail(email);
		if (medico == null) {
			throw new UsernameNotFoundException("Médico não encontrado");
		}
		return User.builder()
				.username(medico.getEmail())
				.password(medico.getSenha())
				.roles(medico.getEspecialidades().toArray(new String[0]))
				.build();
	}
}