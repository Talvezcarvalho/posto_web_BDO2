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

import br.edu.utfpr.td.tsi.MODELO.Bairro;

@Component
public class MysqlBairroDAO implements BairroDAO {
    
    @Autowired
    private DataSource dataSource;

    @Override
    public void inserir(Bairro bairro) {
        String sql = "INSERT INTO bairro (nome) VALUES (?)";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, bairro.getNome());
            preparedStatement.executeUpdate();

            conn.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Long id, Bairro bairro) {
        String sql = "UPDATE bairro SET nome = ? WHERE idBairro = ?";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, bairro.getNome());
            preparedStatement.setLong(2, id);
            preparedStatement.executeUpdate();

            conn.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
    }
}

    @Override
    public void remover(Long id) {
        String sql = "DELETE FROM bairro WHERE idBairro = ?";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

            conn.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Bairro> listarTodos() {
        ArrayList<Bairro> bairros = new ArrayList<>();
        try {
            Connection conn = dataSource.getConnection();
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT idBairro, nome FROM bairro");
            while(resultSet.next()) {
                Long id = resultSet.getLong(1);
                String nome = resultSet.getString(2);
                bairros.add(new Bairro(id, nome));
            }
            conn.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bairros;

    }

    @Override
    public Bairro procurar(Long id) {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'procurar'");
    }
}
