package com.example.demo.models;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "demande_statut")
public class DemandeStatut {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @Column(name = "id_demande")
    private Demande Demande;

    @ManyToOne
    @Column(name = "id_statut")
    private Statut Statut;

    @Column(name = "date")
    private Date date;

    public DemandeStatut() {};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Demande getDemande() {
        return Demande;
    }

    public void setDemande(Demande demande) {
        Demande = demande;
    }

    public Statut getStatut() {
        return Statut;
    }

    public void setStatut(Statut statut) {
        Statut = statut;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
