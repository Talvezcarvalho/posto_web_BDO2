import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import br.edu.utfpr.td.tsi.DAO.JPA.JPABairroDAO;
import br.edu.utfpr.td.tsi.DAO.MongoDB.MongoDBBairroDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.JPAEspecialidadeDAO;
import br.edu.utfpr.td.tsi.DAO.MongoDB.MongoDBEspecialidadeDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.JPAConsultaDAO;
import br.edu.utfpr.td.tsi.DAO.MongoDB.MongoDBConsultaDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.JPAMedicoDAO;
import br.edu.utfpr.td.tsi.DAO.MongoDB.MongoDBMedicoDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.JPAPacienteDAO;
import br.edu.utfpr.td.tsi.DAO.MongoDB.MongoDBPacienteDAO;

@Configuration
@ComponentScan(basePackages = "br.edu.utfpr.td.tsi")
public class AppConfig {

    @Bean
    @Primary
    public JPABairroDAO jpaDbBairroDao() {
        return new JPABairroDAO();
    }

    @Bean
    public MongoDBBairroDAO mongoBairroDAO() {
        return new MongoDBBairroDAO();
    }
    @Bean
    @Primary
    public JPAEspecialidadeDAO jpaDbEspecialidadeDao() {
        return new JPAEspecialidadeDAO();
    }

    @Bean
    public MongoDBEspecialidadeDAO mongoEspecialidadeDAO() {
        return new MongoDBEspecialidadeDAO();
    }
    @Bean
    @Primary
    public JPAConsultaDAO jpaDbConsultaDao() {
        return new JPAConsultaDAO();
    }

    @Bean
    public MongoDBConsultaDAO mongoConsultaDAO() {
        return new MongoDBConsultaDAO();
    }

    @Bean
    @Primary
    public JPAMedicoDAO jpaDbMedicoDao() {
        return new JPAMedicoDAO();
    }

    @Bean
    public MongoDBMedicoDAO mongoMedicoDAO() {
        return new MongoDBMedicoDAO();
    }

    @Bean
    @Primary
    public JPAPacienteDAO jpaDbPacienteDao() {
        return new JPAPacienteDAO();
    }

    @Bean
    public MongoDBPacienteDAO mongoPacienteDAO() {
        return new MongoDBPacienteDAO();
    }
}
