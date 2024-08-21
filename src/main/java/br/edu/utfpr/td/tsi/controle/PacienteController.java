package br.edu.utfpr.td.tsi.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.utfpr.td.tsi.DAO.BairroDAO;
import br.edu.utfpr.td.tsi.DAO.PacienteDAO;
import br.edu.utfpr.td.tsi.MODELO.Bairro;
import br.edu.utfpr.td.tsi.MODELO.Paciente;

@Controller
public class PacienteController {
    
    @Autowired
    private PacienteDAO pacienteDAO;

    @Autowired
    private BairroDAO bairroDAO;

    @GetMapping("/crudPacientes")
    public String paginaCrudPaciente(Model model) {
        return "crudPacientes";
    }
    
    

    @GetMapping(value = "/cadastrarPaciente")
    public String paginaCadastroPaciente(Model model) {
        List<Bairro> bairros = bairroDAO.listarTodos();
        model.addAttribute("bairros", bairros);
        return "cadastrarPaciente";
    }

    @PostMapping("/cadastrarPaciente")
    public String cadastrar(Paciente p) {
        pacienteDAO.inserir(p);
        return "redirect:/crudPacientes" ;
    }
 
    
}
