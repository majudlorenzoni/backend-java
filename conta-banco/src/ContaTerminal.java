import java.util.Scanner;

public class ContaTerminal {
  int numero;
  String agencia;
  String nome;
  double saldo;

    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        conta.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        conta.numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o nome do titular da conta: ");
        conta.nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        if (scanner.hasNextDouble()) {
            conta.saldo = scanner.nextDouble();
        } else {
            System.out.println("Entrada inválida para o saldo.");
            return;
        }


        System.out.println("Olá, " + conta.nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + conta.agencia + ", conta " + conta.numero + ", e seu saldo que é de R$ " + conta.saldo + " já está disponível para saque.");

        scanner.close(); 
    }
}
