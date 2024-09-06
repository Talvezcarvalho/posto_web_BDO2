package br.edu.utfpr.td.tsi.CONTROLLER;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import br.edu.utfpr.td.tsi.MODELO.Medico;
import br.edu.utfpr.td.tsi.SERVICE.MedicoService;

@Controller
public class MedicoController {

    private final MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping("/cadastrarMedico")
    public String formRegistroMedico(Model model) {
        model.addAttribute("medico", new Medico());
        return "cadastrarMedico";
    }

    @PostMapping("/cadastrarMedico")
    public String registrarMedico(@ModelAttribute("medico") Medico medico) {
        medicoService.salvarMedico(medico);
        return "redirect:/login";
    }
}