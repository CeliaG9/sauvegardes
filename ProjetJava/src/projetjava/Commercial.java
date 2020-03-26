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
public class Commercial extends Employe {
    // Attribut spécifique au commercial 
    private final int vente;
    
    
    // Constructeur d'un commercial
    public Commercial(String nom, String prenom, int matricule, int indice, int vente) throws EmployeException {
        super(nom, prenom, matricule, indice);
        this.vente = vente;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return super.toString() + "ventes mensuelles :" + vente;
    }

    // Méthode permettant de calculer le salaire d'un commercial
    @Override
    public double calculerSalaire() {
        double salaire = (double) (12*indice + 0.1*vente);
        return salaire;
    }


}
