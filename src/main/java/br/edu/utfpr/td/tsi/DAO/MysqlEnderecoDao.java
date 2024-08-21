package br.edu.utfpr.td.tsi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.utfpr.td.tsi.MODELO.Endereco;

@Component
public class MysqlEnderecoDao implements EnderecoDAO{
    
    @Autowired
    DataSource dataSource;


    @Override
    public void inserir(Endereco endereco, String idPaciente) {
        String sql = "INSERT INTO endereco (logradouro, numero, cep, idBairro, idPaciente) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, endereco.getLogradouro());
            preparedStatement.setString(2, endereco.getNumero());
            preparedStatement.setString(4, endereco.getCep());
            preparedStatement.setLong(5, endereco.getBairro().getId());
            preparedStatement.setString(6, idPaciente);

            preparedStatement.executeUpdate();
            conn.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void atualizar(String idPaciente, Endereco endereco) {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }


    @Override
    public void remover(String idPaciente) {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }


    @Override
    public Endereco procurar(String idPaciente) {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'procurar'");
    }

}
