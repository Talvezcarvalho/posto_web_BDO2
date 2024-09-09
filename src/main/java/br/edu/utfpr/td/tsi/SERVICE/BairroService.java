package br.edu.utfpr.td.tsi.SERVICE;

import java.util.List;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.BairroEntity;

public interface BairroService {
    
    public void cadastrarBairro(BairroEntity bairro);

    public void removerBairro(Long idBairro);

    public List<BairroEntity> listarBairros();
}
