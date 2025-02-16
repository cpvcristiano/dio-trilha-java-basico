import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Entrada dos números pelo usuário
        System.out.print("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            // Chama o método contar, que executa a lógica do desafio
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Mensagem de erro quando o primeiro parâmetro for maior que o segundo
            System.out.println("Erro: " + e.getMessage());
        }

        // Fechar o Scanner para evitar vazamento de recurso
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Lança a exceção se o primeiro parâmetro for maior ou igual ao segundo
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Calcula a quantidade de interações do loop
        int contagem = parametroDois - parametroUm;

        // Loop para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + (parametroUm + i));
        }
    }
}
