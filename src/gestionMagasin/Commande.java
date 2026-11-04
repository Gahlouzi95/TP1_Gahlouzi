/*
 * Ismaël Gahlouzi - BDML 2
 * TP1 Java - Exercice 4 : Gestion de Magasin
 * Classe Commande : une commande passée par un client
 */
package gestionMagasin;

import java.util.ArrayList;

public class Commande {

    // Compteur partagé par toutes les commandes : sert à donner un numéro unique
    private static int compteur = 0;

    private int idCommande;
    private Client client;
    private ArrayList<Produit> produitsCommandes;
    private double total;

    // Crée une commande à partir d'un client et du contenu de son panier
    public Commande(Client client, Panier panier) {
        compteur++;
        this.idCommande = compteur;
        this.client = client;
        // On COPIE la liste du panier : si le panier est vidé ensuite,
        // la commande garde ses produits
        this.produitsCommandes = new ArrayList<>(panier.getProduits());
        this.total = panier.calculerTotal();
    }

    public int getIdCommande() {
        return idCommande;
    }

    public Client getClient() {
        return client;
    }

    public double getTotal() {
        return total;
    }

    // Affiche le récapitulatif de la commande
    public void afficherDetailsCommande() {
        System.out.println("===== Commande n°" + this.idCommande + " =====");
        System.out.print("Client : ");
        this.client.afficherDetails();
        System.out.println("Produits commandés :");
        for (Produit p : produitsCommandes) {
            System.out.println("- " + p.getNom() + " : " + p.getPrix() + " €");
        }
        System.out.println("Total : " + this.total + " €");
    }
}