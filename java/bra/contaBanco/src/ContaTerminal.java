import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        scanner.nextLine();
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();
        String resposta = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco,").concat(" sua agência é ").concat(agencia).concat(", conta ") + conta;
        System.out.printf("%s e seu saldo é R$ %.2f", resposta, saldo);
        scanner.close();
    }
}
