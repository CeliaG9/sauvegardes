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
public class EmpBase extends Employe {
    
    public EmpBase(String nom, String prenom, int matricule, int indice) throws EmployeException {
        super(nom, prenom, matricule, indice);
    }
    
    // Méthode permettant de calculer le salaire d'un employé de base 
    @Override
    public double calculerSalaire() {
        double salaire = 12*indice;
        return salaire;
    }
    
    
}
