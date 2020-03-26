/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.TreeSet;

/**
 *
 * @author mjule
 */
public class Entreprise {
    // Collection contenant les employés
    private TreeSet<Employe> lesEmployes;

    // Création du constructeur
    public Entreprise() {
        lesEmployes = new TreeSet<>();
    }
    
    // Méthode permettant d'ajouter des employés dans la collection
    public void ajouterEmploye(Employe employe){
        lesEmployes.add(employe);
    }
    
    // Méthode permettant de supprimer des employés de la collection
    public void supprimerEmploye(Employe employe){
        lesEmployes.remove(this);
    }    
    
    // Méthode permettant de calculer les salaires de toute l'entreprise
   /* public double calculSalaireEntreprise(){
        double salairetotal = 0;
        for (Employe employe : lesEmployes){
            salairetotal = 
        }
    }*/
}
    
            
            
            


}
    

    