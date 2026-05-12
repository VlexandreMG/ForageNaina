package com.example.demo.models;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "demande_statut")
public class DemandeStatut {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    @Column(name = "id_demande")
    private int idDemande;

    @OneToMany
    @Column(name = "id_statut")
    private int idStatut;

    @Column(name = "date")
    private Date date;
}
