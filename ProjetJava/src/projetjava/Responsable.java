/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author mjule
 */
public class Responsable extends Employe implements Serializable{

    // Collection contenant les subordonnés : employés sous les ordres d'un responsable
    private final HashSet<Employe> LesSubordonnes;
    private static double sommeSalaire = 0;

    // Constructeur d'un Responsable
    public Responsable(String nom, String prenom, int matricule, int indice) throws EmployeException {
        super(nom, prenom, matricule, indice);
        LesSubordonnes = new HashSet<>();
    }

    // Méthode pour ajouter des subordonnés dans la colletion / HashSet()
    public void ajouterSubordonnes(Employe employe) {
        LesSubordonnes.add(employe);
    }

    // Méthode pour supprimer des subordonnés de la collection
    public void supprimerSubordonnes(Employe employe) {
        LesSubordonnes.remove(employe);
    }

    // Méthode pour calculer la somme des salaires des subordonnées des responsables
    public double calculSalaireSubordonnes() {
        double sommesalaire = 0;

        for (Employe employe : LesSubordonnes) {
            sommesalaire = sommesalaire + employe.calculSalaire();
        }
        return sommesalaire;
    }

    // Méthode permettant d'afficher la liste des subordonnés de chaque Responsable
    // Utilisation d'un itérateur // on pourrait également utiliser une boucle for 
    public void afficherSubordonnes() {

        System.out.print(this + "a pour subordonné(s): \n");
        Iterator<Employe> iterator = LesSubordonnes.iterator(); // L'itérateur est typé // l'itérateur permet de manipuler un objet précis : un employé

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(" / ");
            }
        }

        // retour à la ligne après le dernier subordonné de la liste d'un responsable
        System.out.println("\n");
    }

    // 1ère méthode permettant d'afficher tous les subordonnés (toute la hiérarchie directe inférieure)
    /*@Override
    public void afficherHierarchie() 

        Iterator<Employe> iterator = LesSubordonnes.iterator();
        
        this.afficherSubordonnes();

        while (iterator.hasNext()) {
            if (iterator.hasNext()) {
                iterator.next().afficherHierarchie();
            }
        }
    }
     */
    // 2ème méthode permettant d'afficher tous les subordonnés (toute la hiérarchie directe inférieure)
    public void afficherHierarchie(int profondeur) {
        for (Employe employe : LesSubordonnes) {
            if (employe instanceof Responsable) {
                for (int i = 0; i < profondeur; i++) {
                    System.out.print("\t");
                }
                System.out.println(employe.toString());
                ((Responsable) employe).afficherHierarchie(profondeur + 1);
            } else {

                // afficher profondeur tabulations puis
                for (int i = 0; i < profondeur; i++) {
                    System.out.print("\t");
                }
                System.out.println(employe.toString());
            }
        }
    }

    // Méthode pour calculer les salaires d'une branche de la hiérarchie
    public void calculSalaireHierarchie() {
        sommeSalaire += this.calculSalaire();
        for (Employe employe : LesSubordonnes) {
            if (employe instanceof Responsable) {
                ((Responsable) employe).calculSalaireHierarchie();
            } else {
                sommeSalaire += employe.calculSalaire();
            }
        }
    }
    
    public static double getSommeSalaire() {
        return sommeSalaire;
    }

    // Affichage d'un responsable par héritage de la classe mère (employé) : pas besoin d'écrire le toString() (pas de nouvel var spécifique au responsable à afficher)

   
}

    

