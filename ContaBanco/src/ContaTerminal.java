import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o \nNúmero da Agência: ");
        int numero = scanner.nextInt();

        System.out.print("Nome da Agência: ");
        String agencia = scanner.next();

        System.out.print("Nome do Cliente: ");
        String nomeCliente = scanner.next() + scanner.nextLine();

        System.out.print("Saldo do Cliente: ");
        double saldo = scanner.nextDouble();
        
        System.out.printf("\nOlá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente.toUpperCase(), agencia, numero, saldo);

    }
}
