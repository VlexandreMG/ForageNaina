package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repositories.DemandeStatutRepository;
import com.example.demo.models.DemandeStatut;

@Service
public class DemandeStatutService {
    
    @Autowired 
    private DemandeStatutRepository demandeStatutRepository;

    public DemandeStatut getDemandeStatutByIdDemande(int idDemande) {
        return demandeStatutRepository.findByDemandeId(idDemande);
    }
}
