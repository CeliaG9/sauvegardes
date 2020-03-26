/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author celia
 */
public class ProjetJava {

    /**
     * @param args the command line arguments
     * @throws projetjava.EmployeException
     */
    public static void main(String[] args) throws EmployeException {
        
        // Création de l'entreprise
        Entreprise entreprise = new Entreprise();
        
        
        // Création des employés : une dizaine d'employés au départ
        // Responsables
        entreprise.ajouterEmploye(new Responsable("HUBERT", "Lucas", 101, 175));
        entreprise.ajouterEmploye(new Responsable("LAPORTE", "Anaïs", 102, 175));
        // Employés de base
        entreprise.ajouterEmploye(new EmpBase("GOMEZ", "Dominique", 201, 125));
        entreprise.ajouterEmploye(new EmpBase("SIMON", "Claire", 202, 125));
        entreprise.ajouterEmploye(new EmpBase("JOUBERT", "Marc", 203, 125));
        entreprise.ajouterEmploye(new EmpBase("LEFEVRE", "Gabrielle", 204,125));
        entreprise.ajouterEmploye(new EmpBase("PETIT-JEAN", "Céline", 205,125));
        // Commerciaux
        entreprise.ajouterEmploye(new Commercial("BESSON", "Olivier", 301,150,14));
        entreprise.ajouterEmploye(new Commercial("GROS", "Paul", 302,150,18));
        
        // Affichage de l'entreprise
        System.out.println("L'entreprise comprend :" + entreprise);
        
        
}
    
}
    

