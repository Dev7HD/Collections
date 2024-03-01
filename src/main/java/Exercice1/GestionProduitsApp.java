package Exercice1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        //Q3.1
        List<Produit> produits = new ArrayList<>();
        produits.add(new Produit(1,"HP Omen 15", 13000));
        produits.add(new Produit(2,"Dell Latitude 7750", 15000));
        produits.add(new Produit(3,"MacBook Pro M1", 25000));
        produits.add(new Produit(4,"Acer Predator", 19000));

        //Q3.2
        produits.remove(1);

        //Q3.3
        produits.forEach(System.out::println);

        //Q3.4
        produits.get(1).setNom("MacBook Pro M2");
        System.out.println("\nList des produits après la modification:");
        produits.forEach(System.out::println);

        //Q3.5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir le nom du produit à cherchée: ");
        String nom = scanner.nextLine();
        boolean trouver = false;
        for(Produit p : produits) {
            if(p.getNom().equalsIgnoreCase(nom)) {
                System.out.println("Element trouvé: " + p);
                trouver = true;
                break;
            }
        }
        if (!trouver) {
            System.out.println("Element non trouvé");
        }
    }
}
