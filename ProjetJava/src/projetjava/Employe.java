/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.Objects;

/**
 *
 * @author mjule
 */
public abstract class Employe implements Payable {
    
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

}
