package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.demo.models.Demande;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.services.DemandeService;
import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("/demandes")
public class DemandeController {

    @Autowired
    private DemandeService demandeService;
    
    @GetMapping("/new")
    public String afficherFormulaire(Model model) {
        model.addAttribute("demande", new Demande());
        return "demandes/formulaire";
    }

    @GetMapping("/all")
    public String getAllDemande(Model model) {
        List<Demande> listeDemande = new ArrayList<>();
        listeDemande = demandeService.getAllDemande();

        model.addAttribute("listedemande", listeDemande);
        return "demandes/test";
    }

    @PostMapping("/save")
    public String enregistrerDemande(@ModelAttribute("demande") Demande demande) {
        demandeService.saveNewDemande(demande);
        return "redirect:/demandes/new";
    }

    @PostMapping("/getById")
    public String afficherDemande(Model model ,Long id) {
        Demande demande = demandeService.getDemandeById(id);
        model.addAttribute("demande",demande);
        return "demandes/test";
    }

    @GetMapping("/test")
    public String afficherPageTest() {
        return "demandes/test";
    }
}