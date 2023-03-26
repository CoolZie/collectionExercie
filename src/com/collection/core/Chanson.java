package com.collection.core;

/**
 * Chanson
 */
public class Chanson {

    private String nom;
    private String artiste;
    private int duree;

    public Chanson(String nom, String artiste, int duree) {
        this.nom = nom;
        this.artiste = artiste;
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", artiste='" + getArtiste() + "'" +
            ", duree='" + getDuree() + "'" +
            "}";
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getArtiste() {
        return this.artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public int getDuree() {
        return this.duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

}