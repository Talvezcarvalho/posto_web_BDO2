package br.edu.utfpr.td.tsi.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import br.edu.utfpr.td.tsi.DAO.EspecialidadeDAO;
import br.edu.utfpr.td.tsi.DAO.JPA.Entidades.MedicoEntity;
import br.edu.utfpr.td.tsi.MODELO.Especialidade;
import br.edu.utfpr.td.tsi.MODELO.Medico;
import br.edu.utfpr.td.tsi.SERVICE.EspecialidadeService;
import br.edu.utfpr.td.tsi.SERVICE.MedicoService;
import br.edu.utfpr.td.tsi.SERVICE.MedicoServiceImpl;

@Controller
public class MedicoController {

    @Autowired
    private MedicoServiceImpl medicoService;

    @Autowired
    private EspecialidadeService especialidadeService;

    @Autowired
    private EspecialidadeDAO especialidadeDAO;

    @GetMapping("/cadastrarMedico")
    public String formRegistroMedico(Model model) {
        Iterable<Especialidade> especialidades = especialidadeDAO.listarTodos();
        model.addAttribute("especialidades", especialidades);
        model.addAttribute("medico", new Medico());
        return "cadastrarMedico";
    }

    @PostMapping("/cadastrarMedico")
    public String cadastrarMedico(Medico medico) {
        Long especialidadeId = medico.getEspecialidade().getIdEspecialidade();
        Especialidade especialidade = especialidadeService.procurar(especialidadeId);
        medico.setEspecialidade(especialidade);
        medicoService.cadastrar(medico);
        return "redirect:/cadastrarMedico";
    }
}