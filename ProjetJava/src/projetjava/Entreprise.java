/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;

/**
 *
 * @author mjule
 */
public class Entreprise implements Serializable {

    // Collection contenant les employés
    private final HashSet<Employe> lesEmployes;

    // Constructeur d'une entreprise
    public Entreprise() {
        lesEmployes = new HashSet<>();
    }

    // Méthode permettant d'ajouter des employés dans la collection
    public void ajouterEmploye(Employe employe) {
        lesEmployes.add(employe);
    }

    // Méthode permettant de supprimer des employés de la collection
    public void supprimerEmploye(Employe employe) {
        lesEmployes.remove(employe);
    }

    // Méthode permettant de calculer les salaires de toute l'entreprise
    public double calculSalaireEntreprise() {
        double salairetotal = 0;
        for (Employe employe : lesEmployes) {
            salairetotal = salairetotal + employe.calculSalaire();
        }
        return salairetotal;
    }

    // Affichage de l'entreprise (liste des employés)
    // Avec la boucle forEach // pareil que for(Employe employe : lesEmployes)
    // Affichage de toutes les informations d’un employé quel que soit son type
    public void afficherEmployes() {
        System.out.print("Membres de l'entreprise : \n");
        lesEmployes.forEach((employe) -> {
            System.out.println(employe + " / Salaire : " + employe.calculSalaire() + " euros");
        });
        // retour à la ligne après le dernier employé de la liste de l'entreprise
        System.out.println();
    }

    public void sauver(String filePath) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this);
        oos.close();
    }

    public static Entreprise lire(String filePath) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Entreprise obj = (Entreprise) ois.readObject();
        ois.close();
        return obj;
    }

}
