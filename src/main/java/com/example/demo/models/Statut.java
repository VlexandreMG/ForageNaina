package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "statut")
public class Statut {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "libelle")
    private String libelle;
}
