import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exibir as mensagens para o usuário
        System.out.println(" ========================== ");
        System.out.println(" SEJA BEM-VINDO AO DIOBANC  ");
        System.out.println(" ========================== ");
        System.out.println();

        // Obter os valores digitados no terminal
        System.out.print("Por favor, digite o número da agência: ");
        int numeroAgencia = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor, digite seu nome completo: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o saldo inicial da conta: ");
        double saldo = sc.nextDouble();

        // Exibir a mensagem da conta criada
        System.out.println("\nConta criada com sucesso!");
        System.out.println("Olá " + nomeCliente + ", sua conta na agência " + numeroAgencia + " foi criada.");
        System.out.println("Seu saldo atual é de R$ " + saldo);

        sc.close();
    }
}
