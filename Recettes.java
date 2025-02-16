import java.util.HashMap;
import java.util.Map;
import java.util.Locale;
import java.util.Scanner;
public class Recettes{


    public static void main(String[] args){


        Map< Integer , String> recettes = new HashMap<>();

        recettes.put( 1, "Riz blanc : Mettez de leau dans une marmite, ensuite mettez la au feu et attendre que celleci boui, puis verser le riz que vous avez au prealable lave,rajouter du sel et lesse cuire");
        recettes.put( 2, "Spaguetty bouilli : Mettez de leau dans une marmite, ensuite mettez la au feu et attendre que celleci boui, puis verser le spaguetty et lesse cuire");
        recettes.put( 3, "Riz saute : Dans un premier temps vous decouperez la tomate et les condiment tout petit, Mettre votre marmite au feu et ajouter de lhuile de preference raffine, Verse ses condiment dans lhuile chauffant et lesse cuire, Verser le riz prealablement lave et lesse cuire en rajoutant de l'eau au fur et a mesure ");
        recettes.put( 4, "Spaguetty saute : Dans un premier temps vous decouperez la tomate et les condiment tout petit, Mettre votre marmite au feu et ajouter de lhuile de preference raffine, Verse ses condiment dans lhuile chauffant et lesse cuire, Verser le spaguetty prealablement bouilli et melanger le tout  au fur et a mesure ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre nom :");
        String nom = scanner.nextLine();

        System.out.println("Bienvenue "+nom+" dans notre notre logiciel dapprentissage de recettes diverses");
        System.out.println("Voici la recette dont nous avons mis a votre disposition");

        for ( Map.Entry< Integer , String > entry : recettes.entrySet()){

            System.out.println( entry.getKey()+ "." +entry.getValue().split(":")[0]);
        }

         System.out.println("Entre vle numero de la recettes que vous voulez :");

         try{
            int choix =scanner.nextInt();

        if (recettes.containsKey(choix)){
            System.out.println("Voici la recette du "+recettes.get(choix));
        }
        else{
             System.out.println("Cette recette nexiste pas chez nous "+recettes.size());
        }
        }

        catch(Exception e){
            System.out.println("Entrez un numero valide.");
        }

        scanner.close();

    }
}
