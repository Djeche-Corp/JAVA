import java.util.Scanner;
public class Nongras {


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Entrez votre nom :");
        String nom = scanner.nextLine();

        System.out.println("Bienvenue "+nom+" dans notre logiciel NONGRAS qui vous permet de garder la forme.Nous allons calculer votre IMC, en fonction de vos resulta nous vous donnerons des conseilles pour garder la forme.");

        System.out.println("Entrez votre Poids :");
        double poids = scanner.nextDouble();

        System.out.println("Entre votre Taille :");
        double taille= scanner.nextDouble();

       
            double IMC = poids/taille*taille;

            System.out.println("Votre IMC est de : "+IMC+" Kg/m*m");
            
            if ( IMC < 18.5){
                 System.out.println("Vous etes Mince");
                 System.out.println("Si tu es naturellement mince et que tu veux atteindre un IMC normal, il faut combiner une alimentation adaptee et un programme dentrainement axe sur la prise de masse musculaire.");
                 System.out.println("Suit cette alimentation");
                 System.out.println("Proteines : Viandes maigres, oeufs, poisson, legumineuses, produits laitiers, proteines vegetales. Glucides complexes : Riz, pates completes, patates douces, quinoa, avoine. Bonnes graisses : Avocat, noix, huile dolive, beurre de cacahuete.Fruits et legumes : Apportent des vitamines et mineraux pour soutenir la croissance musculaire.Collations caloriques : Fromage, yaourts, barres proteinees, smoothies hypercaloriques.Exemple de menu pour prise de poids :Petit-dejeuner : Flocons davoine + banane + beurre de cacahuete + lait entier. Dejeuner : Riz complet + poulet + avocat + legumes.Collation : Tartines de pain complet + fromage + fruits secs.Diner : Poisson ou steak + patates douces + legumes grilles.Avant de dormir : Yaourt grec + amandes.");

             System.out.println("Suit cette seance d'entrainement");
             System.out.println("Squats Travail des jambes et du bas du corps.Developpe couche Renforcement des pectoraux et des bras.Tractions ou Rowing Pour le dos et les biceps.Souleve de terre Travail global du corps.Gainage et abdominaux  Pour renforcer le tronc.Routine type (Full Body) :Seance 1 (Pectoraux/Dos/Jambes)Squats : 4 x 8-10Developpe couche : 4 x 8-10Rowing halteres : 4 x 8-10Gainage : 3 x 1 min");
            }
            else if(IMC < 24.8){
                 System.out.println(" Vous etes Normal");
                  System.out.println("Si tu es naturellement mince et que tu veux atteindre un IMC normal, il faut combiner une alimentation adaptee et un programme dentrainement axe sur la prise de masse musculaire.");
                 System.out.println("Suit cette alimentation");
                 System.out.println("Proteines : Viandes maigres, oeufs, poisson, legumineuses, produits laitiers, proteines vegetales. Glucides complexes : Riz, pates completes, patates douces, quinoa, avoine. Bonnes graisses : Avocat, noix, huile dolive, beurre de cacahuete.Fruits et legumes : Apportent des vitamines et mineraux pour soutenir la croissance musculaire.Collations caloriques : Fromage, yaourts, barres proteinees, smoothies hypercaloriques.Exemple de menu pour prise de poids :Petit-dejeuner : Flocons davoine + banane + beurre de cacahuete + lait entier. Dejeuner : Riz complet + poulet + avocat + legumes.Collation : Tartines de pain complet + fromage + fruits secs.Diner : Poisson ou steak + patates douces + legumes grilles.Avant de dormir : Yaourt grec + amandes.");
            }
            else {
                 System.out.println("Vous etes Gros Voir Obese");
                 System.out.println("Si tu es naturellement gros et que tu veux atteindre un IMC normal, il faut combiner une alimentation adaptee et un programme dentrainement axe sur la prise de masse musculaire.");
                 System.out.println("Suit cette alimentation");
                 System.out.println("Proteines : Viandes maigres, oeufs, poisson, legumineuses, produits laitiers, proteines vegetales. Glucides complexes : Riz, pates completes, patates douces, quinoa, avoine. Bonnes graisses : Avocat, noix, huile dolive, beurre de cacahuete.Fruits et legumes : Apportent des vitamines et mineraux pour soutenir la croissance musculaire.Collations caloriques : Fromage, yaourts, barres proteinees, smoothies hypercaloriques.Exemple de menu pour prise de poids :Petit-dejeuner : Flocons davoine + banane + beurre de cacahuete + lait entier. Dejeuner : Riz complet + poulet + avocat + legumes.Collation : Tartines de pain complet + fromage + fruits secs.Diner : Poisson ou steak + patates douces + legumes grilles.Avant de dormir : Yaourt grec + amandes.");
            }

            scanner.close();
    }
}