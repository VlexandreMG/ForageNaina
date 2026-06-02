package com.example.demo.services;

import org.springframework.stereotype.*;

import com.example.demo.repositories.DemandeRepository;
import com.example.demo.repositories.DemandeStatutRepository;
import com.example.demo.repositories.StatutRepository;
import com.example.demo.models.Demande;
import com.example.demo.models.DemandeStatut;
import com.example.demo.models.Statut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.ArrayList;

@Service
public class DemandeService {
    
    @Autowired 
    private DemandeRepository demandeRepository;

    @Autowired 
    private DemandeStatutRepository demandeStatutRepository;

    @Autowired 
    private StatutRepository statutRepository;

    @Transactional 
    public Demande saveNewDemande(Demande Demande) {
        Demande demandeSaved = demandeRepository.save(Demande);

        Statut statut = statutRepository.findById(1)
            .orElseThrow(() -> new RuntimeException("Statut par défaut introuvable"));

        DemandeStatut demandeStatut = new DemandeStatut();
        demandeStatut.setDemande(demandeSaved);
        demandeStatut.setStatut(statut);
        demandeStatut.setDate(new java.sql.Date(System.currentTimeMillis()));

        demandeStatutRepository.save(demandeStatut);

        return demandeSaved;
    }

    @Transactional
    public List<Demande> getAllDemande() {
        return demandeRepository.findAll();
    }
}
