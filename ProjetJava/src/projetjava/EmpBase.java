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
public abstract class EmpBase extends Employe {
    
    public EmpBase(String nom, String prenom, int matricule, int indice) {
        super(nom, prenom, matricule, indice);
    }
    
    public float calculSalaire() {
        float salaire = 12*indice;
        return salaire;
    }
    
}