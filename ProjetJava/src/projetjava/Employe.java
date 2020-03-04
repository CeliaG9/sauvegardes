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

<<<<<<< HEAD
    public Employe(String nom, String prenom, int matricule) throws EmployeException {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        
        // Gestion des exceptions
        // nom
        if (! ('A' <= nom.length() && nom.length() <= 'Z')) // le nom doit être écrit en majuscule // dans le cas inverse : on gère l'exception
            throw new EmployeException ("Le nom doit être écrit intégralement en majuscules. Veuillez donc modifier : " + nom);
        // prénom
        if (! ('A' <= prenom.charAt(0) && prenom.charAt(0) <= 'Z'))
            throw new EmployeException ("Le prénom doit obligatoire commencer par une majuscule. Veuillez donc modifier : " + prenom);
=======
    public Employe(String nom, String prenom, int matricule, int indice){
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.indice = indice;
>>>>>>> 0e7a7891f68ccce2ca0648e22de8adb9bfc566e0
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
    
    @Override
    public String toString() {
        return this.prenom + " " + this.nom + " est " + this.getClass().getSimpleName() + " et touche :";
    }
    
}
