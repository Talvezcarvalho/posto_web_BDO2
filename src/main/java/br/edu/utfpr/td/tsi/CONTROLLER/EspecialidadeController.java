package br.edu.utfpr.td.tsi.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EspecialidadeEntity;
import br.edu.utfpr.td.tsi.MODELO.Especialidade;
import br.edu.utfpr.td.tsi.SERVICE.EspecialidadeService;
import br.edu.utfpr.td.tsi.SERVICE.EspecialidadeServiceImpl;

@Controller
public class EspecialidadeController {

    @Autowired
    private EspecialidadeServiceImpl especialidadeService;


    @GetMapping("/cadastrarEspecialidade")
    public String CadastrarEspecialidade(Model model) {
        return "CadastrarEspecialidade";
    }

    @PostMapping("/cadastrarEspecialidade")
    public String cadastrar(Especialidade especialidade) {
        especialidadeService.cadastrar(especialidade);
        return "redirect:/cadastrarEspecialidade";
    }
    
}
