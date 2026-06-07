package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "district")
public class District {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name= "libelle")
    private String libelle;

    @ManyToOne
    @JoinColumn(name= "id_region")
    private Region region;

    public District() {}

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

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region Region) {
        this.region = Region;
    }
}
