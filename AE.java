import java.util.Scanner;

public class AE{
      
    public static void main(String[] args){


    Scanner scanner = new Scanner(System.in);


    System.out.println ("Entrez votre Nom :");
    String nom = scanner.nextLine();

    System.out.println ("Salut "+nom+" il est question ici dapprentissage, au terme de celui-ci vous pouriez calculer la celebre formule d ALBERD EINSTEIN  E=MC*C:");
    System.out.println ("Commencons par le calcul du piods  P=mgh");


    System.out.println ("Entrez votre Poids :");
    double poids = scanner.nextDouble();

     System.out.println ("Entrez votre Hauter :");
    double hauteur = scanner.nextDouble();

    final double gravite = 9.8;
    final double vitesselumiere = 3*1000000000;

    double Masse = poids/gravite*hauteur ;
    System.out.println ("Votre Masse est de :"+Masse+" Kg");


    System.out.println ("Vue que nous avons deja notre Masse et C qui est une constante et la Vitesse de la lumiere nous pouvont calculer E");

    double E = Masse*(vitesselumiere*vitesselumiere);
    System.out.println ("L'energie de votre objet est de "+E+" Joule");



    scanner.close();

      }

}