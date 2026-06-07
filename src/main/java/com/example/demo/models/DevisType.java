package com.example.demo.models;

import jakarta.persistence.*;


@Entity
@Table(name = "devis_type")
public class DevisType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom; // Contiendra "Standard" ou "Express"

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    // Getters / Setters / Constructeur
}
