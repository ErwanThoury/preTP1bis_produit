package sio.pretp;

public class Categorie {
    private int categorie; // 1 Viande, 2 Fruit/Légume, 3 papeterie
    private String nom;
    private String rayon;
    private boolean produitFrais;

    public Categorie(int categorie, String nom, String rayon, boolean produitFrais) {
        this.categorie = categorie;
        this.nom = nom;
        this.rayon = rayon;
        this.produitFrais = produitFrais;
    }

    public int getCategorie() {
        return categorie;
    }

    public String getNom() {
        return nom;
    }

    public String getRayon() {
        return rayon;
    }

    public boolean isProduitFrais() {
        return produitFrais;
    }
}
