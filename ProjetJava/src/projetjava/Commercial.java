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
    protected float vente;
    
    public Commercial(String nom, String prenom, int matricule, int indice, float vente) throws EmployeException {
        super(nom, prenom, matricule, indice);
        this.vente = vente;
    }
    
    public float calculSalaire() {
        float salaire = (float) (12*indice + 0.1*vente);
        return salaire;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return super.toString();
    }
}
