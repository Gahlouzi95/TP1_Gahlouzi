/*
 * Ismaël Gahlouzi - BDML 2
 * TP1 Java - Exercice 4 : Gestion de Magasin
 * Classe Main : point d'entrée, menu du magasin
 */
package gestionMagasin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Création du magasin et de ses produits
        Magasin magasin = new Magasin();
        magasin.ajouterProduit(new Produit(1, "Clavier", 29.99, 10));
        magasin.ajouterProduit(new Produit(2, "Souris", 15.5, 5));
        magasin.ajouterProduit(new Produit(3, "Ecran", 149.0, 2));
        magasin.ajouterProduit(new Produit(4, "Casque", 59.9, 0));

        // Création du client et de son panier
        Client client = new Client(1, "Dupont", "dupont@mail.fr");
        Panier panier = new Panier();

        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println();
            System.out.println("--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine(); // consomme le retour à la ligne laissé par nextInt

            switch (choix) {
                case 1:
                    magasin.afficherProduitsDisponibles();
                    break;

                case 2:
                    System.out.print("Nom du produit : ");
                    String nom = sc.nextLine();
                    Produit produit = magasin.trouverProduitParNom(nom);
                    if (produit == null) {
                        System.out.println("Produit introuvable.");
                    } else if (produit.getQuantite() == 0) {
                        System.out.println("Produit en rupture de stock.");
                    } else {
                        panier.ajouterProduit(produit);
                        produit.setQuantite(produit.getQuantite() - 1); // on retire 1 du stock
                    }
                    break;

                case 3:
                    panier.afficherPanier();
                    break;

                case 4:
                    if (panier.estVide()) {
                        System.out.println("Votre panier est vide, impossible de commander.");
                    } else {
                        Commande commande = new Commande(client, panier);
                        commande.afficherDetailsCommande();
                        panier.viderPanier();
                        System.out.println("Merci pour votre commande !");
                    }
                    break;

                case 5:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide, entrez un nombre entre 1 et 5.");
                    break;
            }
        } while (choix != 5);

        sc.close();
    }
}