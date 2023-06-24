import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importa a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o Seu nome!");
        String nome = scanner.nextLine();

        System.out.println("Por favor "+nome+", digite sua Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor "+nome+", agora digite o numero da conta!");
        Integer conta = scanner.nextInt();

        System.out.println(nome+", digite o seu saldo!");
        Float saldo = scanner.nextFloat();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");

    }
}