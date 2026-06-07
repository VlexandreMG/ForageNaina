package com.example.demo.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "devis")
public class Devis {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="demande_id")
    private Demande demande;

    @ManyToOne 
    @JoinColumn(name="devis_type")
    private DevisType devisType;

    @Column(name = "date")
    private Date date;

    @Column(name = "observation")
    private String observation;

    public Devis() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Demande getDemande() {
        return demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    public DevisType getDevisType() {
        return devisType;
    }

    public void setDevisType(DevisType devisType) {
        this.devisType = devisType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

}
