/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author mjule
 */
public class Effectif {
    
    protected TreeSet<Employe> entreprise = new TreeSet<>();
    
     public Effectif() {
        Scanner sc;
        try {
            sc = new Scanner(new File("C:\\Users\\mjule\\Desktop\\2A ISIS Ingénieurs\\Projet JAVA\\salaries.txt"));
            String ligne = sc.nextLine();
            while (sc.hasNext()) {
                ligne = sc.nextLine();
                Sexe s = null;
                String[] res = ligne.split(";");
                if (res[2].equals("MALE"))
                        s=Sexe.MALE;
                if (res[2].equals("FEMELLE"))
                        s=Sexe.FEMELLE;
                if (!(res[2].equals("FEMELLE"))&&(!(res[2].equals("MALE"))))
                        throw new AnimalException("Le sexe de l'animal n'est ni mal ni femelle");
                if ("lion".equals(res[1])) {
                    savane.add(new Lion(s,res[0]));
                } else {if ("zebre".equals(res[1])) {
                    savane.add(new Zebre(s,res[0]));
                } else {
                    throw new AnimalException("Le type d'un animal n'est pas bon");
                }}}
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
    
//    Scanner sc;
//        try {
//            sc = new Scanner(new File(C:\\Users\\mjule\\Desktop\\2A_ISIS_Ingénieurs\\Projet_JAVA));
//            
//            // on lit la premiÃ¨re ligne d'entÃªte que l'on ne traite pas
//            String ligne = sc.nextLine();
//
//            while (sc.hasNext()) {
//                // on lit une nouvelle ligne
//                ligne = sc.nextLine();
//                String[] res = ligne.split(",");
//                lesVilles.add(new Ville(res[0], Integer.parseInt(res[1]), Integer.parseInt(res[2]), Integer.parseInt(res[3])));
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }
//
//    }
}
