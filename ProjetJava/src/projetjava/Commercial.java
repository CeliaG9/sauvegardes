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
public class Commercial extends Employe implements Serializable{
    
    // Attribut spécifique à un commercial 
    private final int vente;
    
    // Constructeur d'un commercial
    public Commercial(String nom, String prenom, int matricule, int indice, int vente) throws EmployeException {
        super(nom, prenom, matricule, indice);
        this.vente = vente;
    }

    // Méthode permettant de calculer le salaire d'un commercial
    @Override
    public double calculSalaire() {
        double salaire = (double) (12*indice + 0.1*vente);
        return salaire;
    }
    
    // Affichage d'un commercial par héritage de la classe mère (employé) : ici on a besoin d'écrire le toString() car un veut afficher l'attribut spécifique à un commercial : volume des ventes)
        /**
     *
     * @return
     */
    @Override
    public String toString(){
        return super.toString() + " (Ventes mensuelles : " + vente + ")";
    }

    // Redéfinition de la méthode afficherHierarchie()
    /*@Override
    public void afficherHierarchie() {
        System.out.println(this + "n'a pas de hiérarchie");
    }
    */


}

