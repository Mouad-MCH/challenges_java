import java.util.Scanner;

public class Main4 {
    static Scanner scanner = new Scanner(System.in);
    static int solde = 0;
    public static void main(String[] args) {
        int choix = 0;
        while(choix != 4) {
            menu();
            System.out.println("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch(choix) {
                case 1:mySolde(solde);
                    break;
                case 2: depot();
                break;
                case 3: retrait();
                break;
                case 4 : System.out.println("Good by ");
                break;
                default: System.out.println("not valide !");
            }
        }
    }

    static void menu() {
        System.out.println("1. Consulter le solde");
        System.out.println("2. Dépôt");
        System.out.println("3. Retrait");
        System.out.println("4. Quitter");
    }
    static void mySolde(int sold) {
        System.out.println("/---Consulter le solde --/");
        System.out.println(sold);
    }
    static void depot() {
        System.out.println("Entrez le montant : ");
        int add = scanner.nextInt();
        solde += add;
        System.out.println("Dépôt effectué avec succès.");
    }
    static void retrait() {
        System.out.println("Entrez le montant : ");
        int x = scanner.nextInt();
        solde -= x;
        System.out.println("retrait effectué avec succès.");
    }
}
