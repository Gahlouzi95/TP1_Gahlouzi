/*
 * Ismaël Gahlouzi - BDML 2
 * TP1 Java - Exercice 4 : Gestion de Magasin
 * Classe Client : un client du magasin
 */
package gestionMagasin;

public class Client {

    private int id;
    private String nom;
    private String email;

    public Client(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void afficherDetails() {
        System.out.println("ID client : " + this.id + " | Nom : " + this.nom + " | Email : " + this.email);
    }
}