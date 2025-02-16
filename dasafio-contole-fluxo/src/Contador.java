import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                // Entrada dos números pelo usuário
                System.out.print("Digite o primeiro número: ");
                int parametroUm = terminal.nextInt();

                System.out.print("Digite o segundo número: ");
                int parametroDois = terminal.nextInt();

                // Chama o método contar, que executa a lógica do desafio
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
                terminal.nextLine(); // Limpa a entrada inválida inválida
            }

            // Pergunta ao usuário se deseja continuar
            System.out.print("Deseja executar novamente? (s/n): ");
            String resposta = terminal.next().toLowerCase();

            if (!resposta.equals("s")) {
                continuar = false;
            }
        }

        // Fecha o scanner após sair do loop
        terminal.close();
        System.out.println("Programa encerrado.");
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Lança a exceção se o primeiro parâmetro for maior ou igual ao segundo
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Calcula a quantidade de interações do loop
        int contagem = parametroDois - parametroUm;

        // Loop para imprimir os números
        System.out.print("Contagem: ");
        for (int i = 1; i <= contagem; i++) {
            System.out.print((parametroUm + i) + " ");
        }
        System.out.println(); // Pula linha após a contagem
    }
}
