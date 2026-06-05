package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.models.DemandeStatut;
import org.springframework.ui.Model;
import com.example.demo.services.DemandeStatutService;

@Controller
@RequestMapping("/demandestatut")
public class DemandeStatutController {
    
    @Autowired
    private DemandeStatutService demandeStatutService;

    @GetMapping("/show")
    public String afficherDemandeStatut(Model model, int idDemande) {
        DemandeStatut demandeStatut = demandeStatutService.getDemandeStatutByIdDemande(idDemande);
        model.addAttribute("demandeStatut",demandeStatut);
        return "demandes/test";
    }
}
