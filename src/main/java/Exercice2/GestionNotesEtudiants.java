package Exercice2;

import java.util.HashMap;
import java.util.Map;

public class GestionNotesEtudiants {
    public static void afficher(Map list) {
        System.out.println("\n************** List des notes **************");
        list.forEach((k,v) -> System.out.println("Nom d'étudiant: " + k + ", note: " + v));
        System.out.println("********************************************\n");
    }
    public static void main(String[] args) {
        //Q1
        Map<String, Double> notesEtudiants = new HashMap<>();

        //Q2
        notesEtudiants.put("Etudiant1", 15.5);
        notesEtudiants.put("Etudiant2", 19.0);
        notesEtudiants.put("Etudiant3", 11.0);
        notesEtudiants.put("Etudiant4", 12.2);
        notesEtudiants.put("Etudiant5", 4.0);
        afficher(notesEtudiants);

        //Q3
        System.out.println("L'ancienne note d'Etudiant1: " + notesEtudiants.get("Etudiant1"));
        notesEtudiants.put("Etudiant1", notesEtudiants.get("Etudiant1") + 2);
        System.out.println("La nouvelle note d'Etudiant1: " + notesEtudiants.get("Etudiant1"));
        afficher(notesEtudiants);

        //Q4
        notesEtudiants.remove("Etudiant2");
        afficher(notesEtudiants);

        //Q5
        System.out.println("La taille du map: " + notesEtudiants.size());
        afficher(notesEtudiants);

        //Q6
        double moyenne = 0;
        double somme = 0;
        double min = 20;
        double max = 0;
        for(double note : notesEtudiants.values()){
            somme += note;
            if(note < min) min = note;
            if(note > max) max = note;
        }
        moyenne = somme / notesEtudiants.size();
        System.out.println("La moyenne des notes: " + moyenne);
        System.out.println("La note max: " + max);
        System.out.println("La note min: " + min);
        afficher(notesEtudiants);

        //Q7
        boolean trouver = false;
        for(double note : notesEtudiants.values()){
            if (note == 20.0) {
                System.out.println("La note 20.0 trouvée.");
                break;
            }
        }
        if(!trouver) System.out.println("La note 20.0 non trouvée.");
        afficher(notesEtudiants);
    }

}
