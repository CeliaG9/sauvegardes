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

    // Constructeur d'une entreprise
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
    
    // Affichage de l'entreprise (liste des employés)
    // Avec la boucle forEach // pareil que for(Employe employe : lesEmployes)
    public void afficherEmployes(){
    System.out.print("L'entreprise contient : \n");
    lesEmployes.forEach((employe) -> {  
        System.out.println(employe + " / Salaire : " + employe.calculSalaire() + " euros"); // Affichage de toutes les informations d’un employé quel que soit son type
        });
    // retour à la ligne après le dernier employé de la liste de l'entreprise
    System.out.println();
    }
    
    
 
    }
    
 

    