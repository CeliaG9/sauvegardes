/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.Scanner;

/**
 *
 * @author mjule
 */
public abstract class Employe {
    protected String nom;
    protected String prenom;
    protected int matricule;
    protected int indice;

    public Employe(String nom, String prenom, int matricule, int indice){
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.indice = indice;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getMatricule() {
        return matricule;
    }
   
    public abstract float calculerSalaire();
    
    public int anneeEnCours() {
        Scanner sc = new Scanner(System.in);
        System.out.println("En quelle année sommes-nous ?");
        int annee = sc.nextInt();
        return annee;
    }
        
}
