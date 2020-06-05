/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author celia
 */
public class ProjetJava {

    /**
     * @param args the command line arguments
     * @throws projetjava.EmployeException
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws EmployeException, IOException, FileNotFoundException, ClassNotFoundException {
        try {

            // Création de l'entreprise
            Entreprise entreprise = new Entreprise();
            String filePath = "C:\\Users\\mjule\\Documents\\sauvegardes\\SauvegardesEntreprise\\essaiEntreprise.dat";

            // Création des employés : une quinzaine d'employés au départ
            // Création des responsables
            Responsable resp1 = new Responsable("HUBERT", "Lucas", 101, 200);
            Responsable resp2 = new Responsable("LAPORTE", "Anaïs", 102, 175);
            Responsable resp3 = new Responsable("RIBEIRO", "Auguste", 103, 175);
            Responsable resp4 = new Responsable("TURPIN", "Stéphanie", 104, 175);
            Responsable resp5 = new Responsable("LEVEQUE", "Bertrand", 105, 175);

            // Création des employés de base
            EmpBase EB1 = new EmpBase("GOMEZ", "Dominique", 201, 125);
            EmpBase EB2 = new EmpBase("SIMON", "Claire", 202, 125);
            EmpBase EB3 = new EmpBase("JOUBERT", "Marc", 203, 125);
            EmpBase EB4 = new EmpBase("LEFEVRE", "Gabrielle", 204, 125);
            EmpBase EB5 = new EmpBase("PETITJEAN", "Céline", 205, 125);
            EmpBase EB6 = new EmpBase("BLANCHARD", "Nathalie", 206, 125);
            EmpBase EB7 = new EmpBase("RAYMOND", "Jacques", 207, 125);

            // Création des commerciaux
            Commercial com1 = new Commercial("BESSON", "Olivier", 301, 150, 14);
            Commercial com2 = new Commercial("GROS", "Paul", 302, 150, 18);
            Commercial com3 = new Commercial("DURAND", "Marianne", 303, 150, 16);

            // Réalisation d'une hiérarchie sur papier
            // Affectation de subordonnés à Lucas Hubert (resp1) : chef de l'entreprise
            resp1.ajouterSubordonnes(resp2);
            resp1.ajouterSubordonnes(resp3);
            resp1.ajouterSubordonnes(EB1);
            resp1.ajouterSubordonnes(EB2);

            // Affectation de subordonnés à Anaïs Laporte (resp2)
            resp2.ajouterSubordonnes(EB3);
            resp2.ajouterSubordonnes(resp4);
            // Affectation de subordonnés à Auguste Ribeiro (resp3)
            resp3.ajouterSubordonnes(resp5);
            // Affectation de subordonnés à Stéphanie Turpin (resp4)
            resp4.ajouterSubordonnes(EB4);
            resp4.ajouterSubordonnes(EB5);
            resp4.ajouterSubordonnes(EB6);
            // Affectation de subordonnés à Bertrand Leveque (resp 5)
            resp5.ajouterSubordonnes(EB7);

            // Ajout des employés dans l'entreprise
            // Ajout des responsables 
            entreprise.ajouterEmploye(resp1);
            entreprise.ajouterEmploye(resp2);
            entreprise.ajouterEmploye(resp3);
            entreprise.ajouterEmploye(resp4);
            entreprise.ajouterEmploye(resp5);
            // Ajout des employés de base
            entreprise.ajouterEmploye(EB1);
            entreprise.ajouterEmploye(EB2);
            entreprise.ajouterEmploye(EB3);
            entreprise.ajouterEmploye(EB4);
            entreprise.ajouterEmploye(EB5);
            entreprise.ajouterEmploye(EB6);
            entreprise.ajouterEmploye(EB7);
            // Ajout des commerciaux
            entreprise.ajouterEmploye(com1);
            entreprise.ajouterEmploye(com2);
            entreprise.ajouterEmploye(com3);

            // Affichage des employés de l'entreprise 
            entreprise.afficherEmployes();

            // Hiérarchie directe
            // Affichage d'un responsable et de sa liste de subordonnés 
            System.out.println("****************************************************************************************************");
            resp1.afficherSubordonnes();
            resp2.afficherSubordonnes();
            resp3.afficherSubordonnes();
            resp4.afficherSubordonnes();
            resp5.afficherSubordonnes();

            // 1ère méthode : Hiérarchie intégrale
            //resp0.afficherHierarchie(0);
            // 2ème méthode : Hiérarchie intégrale
            System.out.println("****************************************************************************************************");
            resp1.afficherHierarchie(0);

            // Affichage de la somme des salaires d'une branche de la hiérarchie
            System.out.println("****************************************************************************************************");
            resp2.calculSalaireHierarchie();
            System.out.println("Somme des salaires de la branche hierarchique de " + resp2.getMatricule() + " (" + resp2.toString() + ") : " + resp2.getSommeSalaire() + " euros");

            // Affichage de la somme des salaires des subordonnés d'un responsable
            System.out.println("****************************************************************************************************");
            System.out.println("Somme des salaires des subordonnés de " + resp3.getMatricule() + " (" + resp3.toString() + ") : " + resp3.calculSalaireSubordonnes() + " euros");

            // Affichage de la somme des salaires de l'entreprise
            System.out.println("****************************************************************************************************");
            System.out.println("Somme des salaires de l'entreprise : " + entreprise.calculSalaireEntreprise() + " euros");

            
            // Gestion de la partie sauvegarde
            entreprise.sauver(filePath);
            System.out.println("Entreprise sauvegardée dans le fichier " + filePath);
            Entreprise lue = Entreprise.lire(filePath);
            System.out.println("Entreprise lue = " + lue.toString());

        } catch (EmployeException ex) {
            ex.getMessage();
            Logger.getLogger(ProjetJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
}

    