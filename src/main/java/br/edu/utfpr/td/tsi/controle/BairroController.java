package br.edu.utfpr.td.tsi.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
    
import br.edu.utfpr.td.tsi.DAO.BairroDAO;
import br.edu.utfpr.td.tsi.MODELO.Bairro;

@Controller
public class BairroController {

    @Autowired
    BairroDAO bairroDao;

    @GetMapping("/listarbairros")
    public String listar(Model model) {
        List<Bairro> bairros = bairroDao.listarTodos();
        model.addAttribute("bairros", bairros);
        return "listarbairros";
    }
    

    @GetMapping(value = "/cadastrarbairro")
    public String cadastrarBairro() {
        return "cadastrarbairro";
    }

    @PostMapping("/cadastrarBairro")
    public String cadastrar(Bairro bairro) {
        bairroDao.inserir(bairro);
        return "redirect:/listarbairros";
    }
}
