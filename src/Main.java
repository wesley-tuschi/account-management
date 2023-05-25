import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int saldo = 5000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a sua senha: ");
        String senha = scanner.nextLine();
        System.out.println("Digite sua senha novamente: ");

        if (senha.equals(scanner.nextLine())) {
            System.out.println("Senha correta");
        } else {
            System.out.println("Senha incorreta");
            System.exit(0);
        }
        System.out.println("\nBem vindo " + nome);
        System.out.println("Seu saldo é de R$ " + saldo);
        System.out.println("************");
        String menu = """
                \nOperações:
                1- Consultar Saldos
                2- Depositar
                3- Transferir
                4- Sair""";

        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> System.out.println("Seu saldo é de R$ " + saldo);
                case 2 -> {
                    System.out.println("Digite o valor do depósito: ");
                    int deposito = scanner.nextInt();
                    if (deposito < 0) {
                        System.out.println("Valor de depósito inválido.");
                    } else {
                        saldo = saldo + deposito;
                        System.out.println("Seu saldo é de R$ " + saldo);
                    }
                }
                case 3 -> {
                    System.out.println("Digite o valor da transferência: ");
                    int transferencia = scanner.nextInt();
                    if (transferencia > saldo) {
                        System.out.println("Saldo insuficiente para a transferência.");
                    } else {
                        saldo = saldo - transferencia;
                        System.out.println("Seu saldo é de R$ " + saldo);
                    }
                }
                case 4 -> System.out.println("Obrigado por utilizar nosso sistema");
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
