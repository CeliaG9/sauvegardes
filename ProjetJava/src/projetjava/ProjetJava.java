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
        try {
            
            // Création de l'entreprise
            Entreprise entreprise = new Entreprise();

            // Création des employés : une quinzaine d'employés au départ
            // Création des responsables
            Responsable resp1 = new Responsable("HUBERT", "Lucas", 101, 190);
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
            EmpBase EB7 = new EmpBase("RAYMOND", "Jacques", 206, 125);
            
            // Création des commerciaux
            Commercial com1 = new Commercial("BESSON", "Olivier", 301, 150, 14);
            Commercial com2 = new Commercial("GROS", "Paul", 302, 150, 18);
            Commercial com3 = new Commercial("DURAND", "Marianne", 303, 150, 16);
            
            
            // Affectation de subordonnés à un responsable
            // Pour cela, réalisation d'une hiérarchie sur papier
            // Affectation de subordonnés à Lucas Hubert (resp1)
            resp1.ajoutersubordonnes(resp2);
            resp1.ajoutersubordonnes(resp3);
            resp1.ajoutersubordonnes(EB1);
            resp1.ajoutersubordonnes(EB2);
            // Affectation de subordonnés à Anaïs Laporte (resp2)
            resp2.ajoutersubordonnes(EB3);
            resp2.ajoutersubordonnes(resp4);
            // Affectation de subordonnés à Auguste Ribeiro (resp3)
            resp3.ajoutersubordonnes(resp5);
            // Affectation de subordonnés à Stéphanie Turpin (resp4)
            resp4.ajoutersubordonnes(EB4);
            resp4.ajoutersubordonnes(EB5);
            resp4.ajoutersubordonnes(EB6);
            // Affectation de subordonnés à Bertrand Leveque (resp 5)
            resp5.ajoutersubordonnes(EB7);
            
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
           
   
            // Affichage de l'entreprise
            System.out.println("L'entreprise comprend :" + entreprise);
               
            // entreprise.calculSalaireEntreprise();
            entreprise.calculSalaireEntreprise();
            
        } catch (EmployeException ex) {
            ex.getMessage();
        }
     
    }
}
