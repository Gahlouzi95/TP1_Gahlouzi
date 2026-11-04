/*
 * Ismaël Gahlouzi - BDML 2
 * TP1 Java - Exercice 4 : Gestion de Magasin
 * Classe Magasin : les produits proposés à la vente
 */
package gestionMagasin;

import java.util.ArrayList;

public class Magasin {

    private ArrayList<Produit> produits = new ArrayList<>();

    // Ajoute un produit au catalogue du magasin
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    // Affiche les produits encore en stock
    public void afficherProduitsDisponibles() {
        System.out.println("--- Produits disponibles ---");
        boolean auMoinsUn = false;
        for (Produit p : produits) {
            if (p.getQuantite() > 0) {
                p.afficherDetails();
                auMoinsUn = true;
            }
        }
        if (!auMoinsUn) {
            System.out.println("Aucun produit disponible.");
        }
    }

    // Cherche un produit par son nom (sans tenir compte des majuscules)
    // Renvoie le produit trouvé, ou null s'il n'existe pas
    public Produit trouverProduitParNom(String nom) {
        for (Produit p : produits) {
            if (p.getNom().equalsIgnoreCase(nom)) {
                return p;
            }
        }
        return null;
    }
}