package br.edu.utfpr.td.tsi.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.EspecialidadeEntity;
import br.edu.utfpr.td.tsi.SERVICE.EspecialidadeService;

@Controller
public class EspecialidadeController {

    @Autowired
    private EspecialidadeService especialidadeService;

    public EspecialidadeController() {
        this.especialidadeService = especialidadeService;
    }

    @GetMapping("/CadastrarEspecialidade")
    public String CadastrarEspecialidade(Model model) {
        model.addAttribute("especialidade", new EspecialidadeEntity());
        return "CadastrarEspecialidade";
    }

    @PostMapping("/CadastrarEspecialidade")
    public String CadastrarEspecialidade(@ModelAttribute("especialidade") EspecialidadeEntity especialidade) {
        especialidadeService.cadastrar(especialidade);
        return "redirect:/acessoEspecialidade";
    }
}
