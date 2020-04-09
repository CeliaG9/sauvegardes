/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author mjule
 */
public class Entreprise {
    
    // Collection contenant les employés
    private final HashSet<Employe> lesEmployes;

    // Création du constructeur
    public Entreprise() {
        lesEmployes = new HashSet<>();
    }
    
    // Méthode permettant d'ajouter des employés dans la collection
    public void ajouterEmploye(Employe employe){
        lesEmployes.add(employe);
    }
    
    // Méthode permettant de supprimer des employés de la collection
    public void supprimerEmploye(Employe employe){
        lesEmployes.remove(employe);
    }    
    
    // Méthode permettant de calculer les salaires de toute l'entreprise
    public double calculSalaireEntreprise(){
        double salairetotal = 0;
        for (Employe employe : lesEmployes){
            salairetotal = salairetotal + employe.calculSalaire();
        }
        return salairetotal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.lesEmployes);
        return hash;
    }

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
        final Entreprise other = (Entreprise) obj;
        if (!Objects.equals(this.lesEmployes, other.lesEmployes)) {
            return false;
        }
        return true;
    }    
    
    @Override
    public String toString() {
        return lesEmployes.toString();
    }
    
}
    
            
            
            



    

    