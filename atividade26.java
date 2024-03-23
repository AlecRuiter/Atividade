import java.util.Scanner;

public class atividade26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        int[] votos = new int[3];

        for (int i = 0; i < totalEleitores; i++) {
            System.out.println("Eleitor " + (i + 1) + ":");
            System.out.println("1 - Candidato 1");
            System.out.println("2 - Candidato 2");
            System.out.println("3 - Candidato 3");
            System.out.print("Seu voto: ");
            int voto = scanner.nextInt();

            if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++;
            } else {
                System.out.println("Voto inválido! Por favor, vote novamente.");
                i--;
            }
        }

        System.out.println("Resultado da eleição:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos");
        }

        scanner.close();
    }
}
