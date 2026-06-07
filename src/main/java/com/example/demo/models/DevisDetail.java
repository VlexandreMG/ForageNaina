package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "devis_detail")
public class DevisDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Plusieurs lignes de détails appartiennent à un seul Devis
    @ManyToOne
    @JoinColumn(name = "id_devis") // Clé étrangère vers la table devis
    private Devis devis;

    @Column(name = "quantite")
    private int quantite;

    @Column(name = "prix_unitaire")
    private double prixUnitaire; // Utilisation de double pour gérer les décimales (Ariary...)

    public DevisDetail() {}

    // Fonction super pratique pour calculer le montant total de cette ligne
    public double getMontantLigne() {
        return this.quantite * this.prixUnitaire;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Devis getDevis() {
        return devis;
    }

    public void setDevis(Devis devis) {
        this.devis = devis;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
}