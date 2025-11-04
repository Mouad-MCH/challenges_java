import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

    }
}