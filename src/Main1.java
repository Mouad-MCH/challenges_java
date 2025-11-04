import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Hello world !");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = scanner.nextLine();

        System.out.println("Bonjour, " + userName);
    }
}