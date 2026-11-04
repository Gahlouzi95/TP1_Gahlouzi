/*
 * Ismaël Gahlouzi - BDML 2
 * TP1 Java - Exercice 4 : Gestion de Magasin
 * Classe Panier : les produits choisis par un client
 */
package gestionMagasin;

import java.util.ArrayList;

public class Panier {

    // La liste est créée tout de suite avec new (sinon elle vaut null)
    private ArrayList<Produit> produits = new ArrayList<>();

    // Ajoute un produit au panier
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
        System.out.println(produit.getNom() + " ajouté au panier.");
    }

    // Supprime un produit du panier
    public void supprimerProduit(Produit produit) {
        if (produits.remove(produit)) {
            System.out.println(produit.getNom() + " retiré du panier.");
        } else {
            System.out.println(produit.getNom() + " n'est pas dans le panier.");
        }
    }

    // Affiche tous les produits du panier
    public void afficherPanier() {
        if (produits.isEmpty()) {
            System.out.println("Le panier est vide.");
        } else {
            System.out.println("--- Contenu du panier ---");
            for (Produit p : produits) {
                System.out.println("- " + p.getNom() + " : " + p.getPrix() + " €");
            }
            System.out.println("Total : " + calculerTotal() + " €");
        }
    }

    // Calcule le montant total du panier
    public double calculerTotal() {
        double total = 0;
        for (Produit p : produits) {
            total = total + p.getPrix();
        }
        return total;
    }

    // Renvoie la liste des produits (utile pour créer une commande)
    public ArrayList<Produit> getProduits() {
        return produits;
    }

    // Indique si le panier est vide
    public boolean estVide() {
        return produits.isEmpty();
    }

    // Vide le panier (après une commande)
    public void viderPanier() {
        produits.clear();
    }
}