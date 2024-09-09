package br.edu.utfpr.td.tsi.DAO;

import java.util.List;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.BairroEntity;

public interface BairroDAO {
    public void inserir(BairroEntity bairro);

    public void atualizar(Long id, BairroEntity bairro);

    public void remover(Long id);

    public List<BairroEntity> listarTodos();

    public BairroEntity procurar(Long id);
}
