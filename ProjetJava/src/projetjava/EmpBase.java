/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.io.Serializable;

/**
 *
 * @author mjule
 */
public class EmpBase extends Employe implements Serializable{
    
    // Constructeur d'un employé de base
    public EmpBase(String nom, String prenom, int matricule, int indice) throws EmployeException {
        super(nom, prenom, matricule, indice);
    }

    // Affichage d'un employé de base par héritage de la classe mère (employé) : pas besoin d'écrire le toString() (pas de nouvel attribut spécifique à l'employé de base à afficher)
    
    // Redéfinition de la méthode afficherHierarchie()
    /*@Override
    public void afficherHierarchie() {
        System.out.println(this + "n'a pas de hiérarchie");
    */
}

