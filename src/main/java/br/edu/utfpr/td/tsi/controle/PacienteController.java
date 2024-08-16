package br.edu.utfpr.td.tsi.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.utfpr.td.tsi.DAO.BairroDAO;
import br.edu.utfpr.td.tsi.DAO.PacienteDAO;
import br.edu.utfpr.td.tsi.MODELO.Bairro;

@Controller
public class PacienteController {
    
    @Autowired
    private PacienteDAO pacienteDAO;

    @Autowired
    private BairroDAO bairroDAO;

    @GetMapping(value  = "/cadastrarPaciente")
    public String paginaCadastroPaciente(Model model) {
        List<Bairro> bairros = bairroDAO.listarTodos();
        model.addAttribute("bairros", bairros);
        return "cadastrarPaciente";
    }

    
}
