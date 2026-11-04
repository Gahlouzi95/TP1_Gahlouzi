/*
 * Ismaël Gahlouzi - BDML 2
 * TP1 Java : classe Personne (exercices 1 et 2)
 */
package Exo1;

import java.time.LocalDate;

public class Personne {

    // Attributs
    private String Nom;
    private String Prenom;
    private int AnNaissance;

    // Q12 : compteur partagé par TOUTES les personnes (static)
    private static int nbPersonnes = 0;

    // Q3 : constructeur naturel
    public Personne(String Nom, String Prenom, int AnNaissance) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.AnNaissance = AnNaissance;
        nbPersonnes++;
        afficherNbPers();
    }

    // Q3 : constructeur avec nom = "Inconnu"
    public Personne(String Prenom, int AnNaissance) {
        this.Nom = "Inconnu";
        this.Prenom = Prenom;
        this.AnNaissance = AnNaissance;
        nbPersonnes++;
        afficherNbPers();
    }

    // Q3 : constructeur par défaut (appelle le premier constructeur)
    public Personne() {
        this("Potter", "Harry", 1980);
    }

    // Q4 : getters
    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public int getAnNaissance() {
        return AnNaissance;
    }

    // Q5 : setters
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setAnNaissance(int AnNaissance) {
        this.AnNaissance = AnNaissance;
    }

    // Q6 : calcul de l'âge
    public int calculerAge() {
        return LocalDate.now().getYear() - this.AnNaissance;
    }

    // Q7 : affichage des informations
    public void afficherInfos() {
        System.out.println("Nom: " + this.Nom);
        System.out.println("Prénom: " + this.Prenom);
        System.out.println("Âge: " + calculerAge());
    }

    // Q8 : la personne mange
    public void mange(String repas) {
        System.out.println(this.Nom + " " + this.Prenom + " mange un/une " + repas);
    }

    // Q12 : affiche le nombre de personnes créées
    public static void afficherNbPers() {
        System.out.println("Nombre de personnes créées : " + nbPersonnes);
    }

    // Q9 : point d'entrée du programme
    public static void main(String[] args) {

        // Q10 : 3 instances, une par constructeur
        Personne personne1 = new Personne("Dupont", "Jean", 2004);
        Personne personne2 = new Personne("Anna", 2002);
        Personne personne3 = new Personne();
        System.out.println();

        // Q11 : getters
        System.out.println("Nom de personne1 : " + personne1.getNom());
        System.out.println("Prénom de personne2 : " + personne2.getPrenom());
        System.out.println("Année de personne3 : " + personne3.getAnNaissance());
        System.out.println();

        // Q11 : setters (personne1 devient Jacques, né en 1991)
        personne1.setPrenom("Jacques");
        personne1.setAnNaissance(1991);
        personne2.setNom("Martin");

        // Q11 : calculerAge, afficherInfos, mange
        System.out.println("Âge de personne1 : " + personne1.calculerAge());
        personne1.afficherInfos();
        personne2.afficherInfos();
        personne3.afficherInfos();
        personne1.mange("Sandwich");
        personne3.mange("Pomme");
    }
}