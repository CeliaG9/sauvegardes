/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author mjule
 */
public class Responsable extends Employe {
    
    // Collection contenant les subordonnés : employés sous les ordres d'un responsable
    private final HashSet<Employe> LesSubordonnes;

    // Constructeur d'un Responsable
    public Responsable(String nom, String prenom, int matricule, int indice) throws EmployeException {
        super(nom, prenom, matricule, indice);
        LesSubordonnes = new HashSet<>();
    }
    
    // Méthode pour ajouter des subordonnés dans la colletion / TreeSet()
    public void ajoutersubordonnes(Employe employe){
        LesSubordonnes.add(employe);
    }
    
    // Méthode pour supprimer des subordonnés de la collection
    public void supprimersubordonnes(Employe employe){
        LesSubordonnes.remove(employe);
    }
    
    // Méthode calculSalaire()
    @Override
    public double calculSalaire() {
        double salaire = 12*indice;
        return salaire;
    }
    
    // Méthode pour calculer la somme des salaires des subordonnées des responsables
    public double calculSalaireSubordonnes(){
        double salaireresp = 0;
        double salairesub = 0;
        double sommesalaire = 0;
        
        for (Employe employe : LesSubordonnes){
            if (employe.getClass().getSimpleName().equals(this.getClass().getSimpleName())){
                salaireresp = salaireresp + employe.calculSalaire();
                return salaireresp;
            }else{
                salairesub = salairesub + employe.calculSalaire();
                return salairesub;
            }
        }
        return sommesalaire = salaireresp + salairesub;
    }
    
    // Méthode permettant d'afficher la liste de subordonnés de chaque Responsable
    // Utilisation d'un itérateur
    public void affichersubordonnes(){
    System.out.print(this + "a pour subordonné(s): \n");
    Iterator iterator = LesSubordonnes.iterator();
    while(iterator.hasNext())
        System.out.print(iterator.next());
    }
        
    //for(Employe employe : LesSubordonnes){
    //System.out.print(employe);
   
    
    // Affichage d'un responsable par héritage de la classe mère (employé) : pas besoin d'écrire le toString() (pas de nouvel attribut spécifique au responsable à afficher)
  
    
}

