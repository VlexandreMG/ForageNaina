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

    @PostMapping("/save")
    public String enregistrerDemande(@ModelAttribute("demande") Demande demande) {
        demandeService.saveNewDemande(demande);
        return "redirect:/demandes/new";
    }

    @GetMapping("/demandes/test")
    public String afficherPageTest() {
        return "demandes/test";
    }
}