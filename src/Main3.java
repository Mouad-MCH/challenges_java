import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = (int)(Math.random() * 11);
        System.out.println("Devinez le nombre : ");
        int user = scanner.nextInt();
        while(user != x) {
            if(user<x) {
                System.out.println("Trop petit ! Essayez encore.");
            }else {

                System.out.println("tree grond ! Essayez encore.");
            }

            System.out.println("Devinez le nombre : ");
            user = scanner.nextInt();

        }
        System.out.println("Bravo ! Vous avez trouvé.");
    }
}
