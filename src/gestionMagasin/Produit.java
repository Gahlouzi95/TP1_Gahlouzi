/*
 * Ismaël Gahlouzi - BDML 2
 * TP1 Java - Exercice 4 : Gestion de Magasin
 * Classe Produit : un produit vendu par le magasin
 */
package gestionMagasin;

public class Produit {

    private int id;
    private String nom;
    private double prix;
    private int quantite;

    public Produit(int id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void afficherDetails() {
        System.out.println("ID : " + this.id + " | Nom : " + this.nom
                + " | Prix : " + this.prix + " € | Quantité : " + this.quantite);
    }
}