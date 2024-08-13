package br.edu.utfpr.td.tsi.DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.utfpr.td.tsi.MODELO.Paciente;

@Component
public class MysqlPacienteDao implements PacienteDAO {
    
    @Autowired
    private DataSource dataSource;

    @Override
    public void inserir(Paciente paciente) {
        String sql = "INSERT INTO paciente (nome, sobrenome, data_Nascimento) VALUES (?, ?, ?)";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, paciente.getNome());
            preparedStatement.setString(2, paciente.getSobrenome());
            preparedStatement.setDate(3, java.sql.Date.valueOf(paciente.getDataNascimento()));
            preparedStatement.executeUpdate();

            conn.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(String id, Paciente paciente) {
        String sql = "UPDATE paciente SET nome = ?, sobrenome = ?, data_Nascimento = ? WHERE idPaciente = ?";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, paciente.getNome());
            preparedStatement.setString(2, paciente.getSobrenome());
            preparedStatement.setDate(3, java.sql.Date.valueOf(paciente.getDataNascimento()));
            preparedStatement.setString(4, id);
            preparedStatement.executeUpdate();

            conn.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remover(String id) {
        String sql = "DELETE FROM paciente WHERE idPaciente = ?";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

            conn.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    @Override
    public List<Paciente> listarTodos() {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try {
            Connection conn = dataSource.getConnection();
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery( "SELECT idPaciente, nome, sobrenome, data_Nascimento FROM paciente");
            while (result.next()) {
                String id = result.getString(1);
                String nome = result.getString(2);
                String sobrenome = result.getString(3);
                java.sql.Date dataNascimento = result.getDate(4);
                pacientes.add(new Paciente(id, nome, sobrenome, dataNascimento.toLocalDate()));
            }
            return pacientes;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pacientes;
    }

    @Override
    public Paciente procurar(String id) {
        String sql = "SELECT idPaciente, nome, sobrenome, data_Nascimento FROM paciente WHERE idPaciente = ?";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet result = preparedStatement.executeQuery();
            if (result.next()) {
                String nome = result.getString(2);
                String sobrenome = result.getString(3);
                java.sql.Date dataNascimento = result.getDate(4);
                return new Paciente(id, nome, sobrenome, dataNascimento.toLocalDate());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
