package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.DemandeStatut;

@Repository
public interface DemandeStatutRepository extends JpaRepository<DemandeStatut, Long> {
    
    DemandeStatut findByDemandeId(int idDemande);
}
