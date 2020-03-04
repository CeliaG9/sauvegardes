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
public abstract class Commercial extends Employe {
    protected int partVariable;
    protected int vente;
    
    public Commercial(String nom, String prenom, int matricule) {
        super(nom, prenom, matricule);
    }
    
}
