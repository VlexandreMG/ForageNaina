package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "commune")
public class Commune {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "libelle")
    private String libelle;

    @ManyToOne
    @JoinColumn(name = "id_district")
    private District District;

    public Commune() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public District getDistrict() {
        return District;
    }

    public void setDistrict(District District) {
        this.District = District;
    }
    
    
}
