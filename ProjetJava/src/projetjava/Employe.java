/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author mjule
 */
public abstract class Employe implements Payable, Serializable {
    
    // Attributs d'un employé
    private final String nom;
    private final String prenom;
    private final int matricule;
    protected int indice;
    
    // Constructeur d'un employé
    public Employe(String nom, String prenom, int matricule, int indice) throws EmployeException {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.indice = indice;

        // Gestion des exceptions
        // nom
        if (!nom.equals(nom.toUpperCase())) // le nom doit être écrit intégralement en majuscule // dans le cas inverse : on gère l'exception
        {
            throw new EmployeException("Le nom doit être écrit intégralement en majuscules. Veuillez donc modifier : " + nom);
        }
        // prénom
        if (!('A' <= prenom.charAt(0) && prenom.charAt(0) <= 'Z')) {
            throw new EmployeException("Le prénom doit obligatoire commencer par une majuscule. Veuillez donc modifier : " + prenom);
        }

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getMatricule() {
        return matricule;
    }
    
    // Méthode calculSalaire() héritée par les classes EmpBase et Responsable
    @Override
    public double calculSalaire() {
        double salaire = 12 * indice;
        return salaire;
    }
    
    // Méthode abstraite : afficherHierarchie()
    //public abstract void afficherHierarchie();

    // Création de deux hashSet() contenant des employés
    // Redéfinition des méthodes hashCode() et equals() nécessaire
    // hashCode()
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nom);
        hash = 29 * hash + Objects.hashCode(this.prenom);
        hash = 29 * hash + this.matricule;
        hash = 29 * hash + this.indice;
        return hash;
    }
    // equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employe other = (Employe) obj;
        if (this.matricule != other.matricule) {
            return false;
        }
        if (this.indice != other.indice) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        return true;
    }

    // Affichage d'un employé
    @Override
    public String toString() {
        return this.prenom + " " + this.nom + " : " + this.getClass().getSimpleName();
    }

   

    
    
  
    
    // PARTIE SAUVEGARDE
    /**
     * Méthode de classe permettant de lire et retourner un objet Personne dans
     * la String passée en paramètre.
     *
     * @param content La String à parcourir
     * @return L'objet Personne lu dans la String content.
     */
    /*public static Employe lireEmploye(String content) throws EmployeException {
        Scanner sc = new Scanner(content);
        String ligne = sc.next();
        StringTokenizer token = new StringTokenizer(ligne, "|");
        String nom = token.nextToken();
        String prenom = token.nextToken();
        String smatricule = token.nextToken();
        int matricule = Integer.parseInt(smatricule);
        String sindice = token.nextToken();
        int indice = Integer.parseInt(sindice);
        Employe newEmploye = new Employe (nom, prenom, matricule, indice) {};
        return newEmploye;
    }

    public String getTexteASauver() {
        return nom + "|" + prenom + "|" + matricule;
    }*/
    
}


