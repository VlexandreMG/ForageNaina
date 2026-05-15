package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.demo.models.Demande;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.services.DemandeService;

@Controller
public class DemandeController {

    @Autowired
    private DemandeService demandeService;
    
    @GetMapping("/demandes/new")
    public String afficherFormulaire(Model model) {
        model.addAttribute("demande", new Demande());
        return "demandes/formulaire";
    }

    @PostMapping("/save")
    public String enregistrerDemande(@ModelAttribute("demande") Demande demande) {
        demandeService.saveNewDemande(demande);
        return "redirect:/demandes/save";
    }
}