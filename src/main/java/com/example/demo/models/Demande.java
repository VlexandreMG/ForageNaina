package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "demande")
public class Demande {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client Client;

    @ManyToOne
    @JoinColumn(name = "id_commune")
    private Commune Commune;

    @Column(name = "lieu")
    private String lieu;

    public Demande() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client client) {
        this.Client = client;
    }

    public Commune getCommune() {
        return Commune;
    }

    public void setCommune(Commune commune) {
        this.Commune = commune;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
