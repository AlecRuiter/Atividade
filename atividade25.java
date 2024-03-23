import java.util.Scanner;

public class atividade25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas na turma? ");
        int n = scanner.nextInt();

        int somaIdades = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade" + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double mediaIdades = somaIdades / n;

        System.out.println("A média de idade     é: " + mediaIdades);

        if (mediaIdades <= 25) {
            System.out.println("A turma é jovem.");
        } else if (mediaIdades <= 60) {
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }

        scanner.close();
    }
}
