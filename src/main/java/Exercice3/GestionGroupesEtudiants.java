package Exercice3;

import java.util.HashSet;
import java.util.Set;

public class GestionGroupesEtudiants {
    public static void main(String[] args) {
        //Q1
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        //Q2
        //GroupeA
        groupeA.add("Ahmed");
        groupeA.add("Mohammed");
        groupeA.add("Zakaria");

        //GroupeB
        groupeB.add("Mohammed");
        groupeB.add("Hamza");
        groupeB.add("Ayoub");

        //Q2
        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("L'intersection des deux Sets: " + intersection);

        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("L'union des deux Sets: " + union);
    }
}
