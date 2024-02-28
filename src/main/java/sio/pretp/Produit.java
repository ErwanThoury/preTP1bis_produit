package sio.pretp;

public class Produit {
    private double prix;
    private int lot;
    private boolean estDispo;
    private String nom;
    private Categorie laCategorie;
    private String marque;

    public Produit(double prix, int lot, boolean estDispo, String nom, Categorie categorie, String marque) {
        this.prix = prix;
        this.lot = lot;
        this.estDispo = estDispo;
        this.nom = nom;
        this.laCategorie = categorie;
        this.marque = marque;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public int getLot() {
        return lot;
    }

    public boolean isEstDispo() {
        return estDispo;
    }

    public String getNom() {
        return nom;
    }

    public Categorie getLaCategorie() {
        return laCategorie;
    }
}
