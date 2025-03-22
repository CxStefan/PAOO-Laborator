import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num1 = null, num2 = null;

        try {
            System.out.print("Introduceți primul număr: ");
            num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Introduceți al doilea număr: ");
            num2 = Integer.parseInt(scanner.nextLine());

            int sum = num1 + num2;
            System.out.println("Suma este: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Eroare: Introduceți doar numere întregi valide.");
        } catch (NullPointerException e) {
            System.out.println("Eroare: Unul dintre numere este null.");
        } finally {
            scanner.close();
        }
    }
}
