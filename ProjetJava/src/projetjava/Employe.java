/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author mjule
 */
public abstract class Employe {
    protected String nom;
    protected String prenom;
    protected int matricule;

    public Employe(String nom, String prenom, int matricule){
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
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
      
    public abstract float calculerSalaire();
    
}
