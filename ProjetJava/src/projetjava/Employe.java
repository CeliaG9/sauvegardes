/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.Objects;


/**
 *
 * @author mjule
 */
public abstract class Employe implements Comparable<Employe>  {
    protected String nom;
    protected String prenom;
    protected int matricule;
    protected int indice;


    public Employe(String nom, String prenom, int matricule, int indice) throws EmployeException {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.indice = indice;
    }
        
        // Gestion des exceptions
        // nom
    /*if (! ('A' <= nom.length() && nom.length() <= 'Z')) // le nom doit être écrit en majuscule // dans le cas inverse : on gère l'exception
        throw new EmployeException ("Le nom doit être écrit intégralement en majuscules. Veuillez donc modifier : " + nom);
        // prénom
    if (! ('A' <= prenom.charAt(0) && prenom.charAt(0) <= 'Z'))
        throw new EmployeException ("Le prénom doit obligatoire commencer par une majuscule. Veuillez donc modifier : " + prenom);
 
    }*/
    

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getMatricule() {
        return matricule;
    }
   
    public abstract double calculerSalaire();

    
    // TreeSet() : nécessite de redéfinir les méthodes hashCode(), equals() et CompareTo()
    // Méthode hashCode()
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nom);
        hash = 29 * hash + Objects.hashCode(this.prenom);
        hash = 29 * hash + this.matricule;
        hash = 29 * hash + this.indice;
        return hash;
    }
    
    // Méthode equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employe other = (Employe) obj;
        if (this.matricule != other.matricule) {
            return false;
        }
        if (this.indice != other.indice) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        return true;
    }
    
    // Méthode CompareTo()
    @Override
    public int compareTo(Employe employe){ // On compare les employés en fonction de leur type (Employé de base, Responsable, Commercial)
        if (this.getClass().getSimpleName().equals(employe.getClass().getSimpleName())){ // Si le type est le même
            if (this.matricule < employe.matricule){ // On compare en fonction du matricule 
                return -1; // cours : Renvoie une valeur négative si obj1 < obj2
            }else{
            return 1; 
            }
            
        }else{ // Si le type n'est pas le même
            this.getClass().getSimpleName().equals(employe.getClass().getSimpleName()); // On compare en fonction du type
        }
        return 0;
        
    }
    
      
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return this.prenom + " " + this.nom + " est " + this.getClass().getSimpleName() + " et touche :";
    }
    
}
