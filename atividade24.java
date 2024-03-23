import java.util.Scanner;

public class atividade24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas você deseja inserir? ");
        int quantidadeNotas = scanner.nextInt();

        double somaNotas = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            somaNotas += scanner.nextDouble();
        }

        System.out.println("A média das notas é: " + (somaNotas / quantidadeNotas));

        scanner.close();
    }
}
