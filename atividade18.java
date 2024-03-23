import java.util.Scanner;

public class atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números no conjunto: ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade de números deve ser positiva.");
            return;
        }

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();

            if (numero < menor) {
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            }

            soma += numero;
        }

        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + soma);

        scanner.close();
    }
}
