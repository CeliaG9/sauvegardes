/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.TreeSet;

/**
 *
 * @author mjule
 */
public abstract class Responsable extends Employe {
    // Collection pour les subordonnés
    private TreeSet<Employe> subordonnes;
    
    // Constructeur d'un Responsable
    public Responsable(String nom, String prenom, int matricule, int indice) throws EmployeException {
        super(nom, prenom, matricule, indice);
        subordonnes = new TreeSet<>();
    }
    
    // Méthode pour ajouter des subordonnés dans la colletion / TreeSet()
    public void ajoutersubordonnes(Employe employe){
        subordonnes.add(employe);
    }
    
    // Méthode pour supprimer des subordonnés de la collection
    public void supprimersubordonnes(Employe employe){
        subordonnes.remove(employe);
    }
    
    // Méthode calculSalaire()
    public double calculSalaire() {
        float salaire = 12*indice;
        return salaire;
    }
    
    // Affichage 
    @Override
    public String toString(){
        return super.toString();
    }
}
