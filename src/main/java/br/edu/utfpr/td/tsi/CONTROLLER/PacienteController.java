package br.edu.utfpr.td.tsi.CONTROLLER;

import br.edu.utfpr.td.tsi.DAO.BairroDAO;
import br.edu.utfpr.td.tsi.DAO.PacienteDAO;
import br.edu.utfpr.td.tsi.MODELO.Bairro;
import br.edu.utfpr.td.tsi.MODELO.Paciente;
import br.edu.utfpr.td.tsi.SERVICE.EnderecoService;
import br.edu.utfpr.td.tsi.SERVICE.PacienteService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private BairroDAO bairroService;



    @GetMapping("/acessoPaciente")
    public String paginaCrudPaciente(Model model) {
        List<Paciente> pacientes = pacienteService.listarTodos();
        model.addAttribute("pacientes", pacientes);
        return "acessoPaciente";
    }

    @GetMapping(value = "/cadastrarPaciente")
    public String paginaCadastroPaciente(Model model) {
        List<Bairro> bairros = bairroService.listarTodos();
        model.addAttribute("bairros", bairros);
        return "cadastrarPaciente";
    }

    @PostMapping("/cadastrarPaciente")
    public String cadastrar(Paciente p) {
        pacienteService.cadastrar(p);
        return "redirect:/acessoPaciente";
    }
}
