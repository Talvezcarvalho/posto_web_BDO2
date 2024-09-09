package br.edu.utfpr.td.tsi.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.MedicoEntity;
import br.edu.utfpr.td.tsi.SERVICE.MedicoService;

@Controller
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping("/cadastrarMedico")
    public String formRegistroMedico(Model model) {
        model.addAttribute("medico", new MedicoEntity());
        return "cadastrarMedico";
    }

    @PostMapping("/cadastrarMedico")
    public String registrarMedico(@ModelAttribute("medico") MedicoEntity medico) {
        medicoService.salvarMedico(medico);
        return "redirect:/login";
    }
}