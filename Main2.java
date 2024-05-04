import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Informe o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        Contadebanco conta = new Contadebanco(nome, numeroConta, saldoInicial);
        System.out.println("Conta bancária criada com sucesso.");

        char opcao;

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Obter saldo");
            System.out.println("Q. Sair");

            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case '1':
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case '2':
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case '3':
                    double saldo = conta.obterSaldo();
                    System.out.println("Saldo disponível: R$ " + saldo);
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha novamente.");
            }
        } while (opcao != 'Q' && opcao != 'q');

        scanner.close();
    }
}
