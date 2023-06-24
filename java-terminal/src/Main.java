import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua Altura");
        double altura = scanner.nextDouble();

        System.out.println("andre tem "+altura+" de altura.");
    }
}