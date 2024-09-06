package br.edu.utfpr.td.tsi.SERVICE;

import java.util.List;

import br.edu.utfpr.td.tsi.MODELO.Bairro;

public interface BairroService {
    
    public void cadastrarBairro(Bairro bairro);

    public void removerBairro(Long idBairro);

    public List<Bairro> listarBairros();
}
