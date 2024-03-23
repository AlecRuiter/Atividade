import java.util.Scanner;

public class atividade27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas turmas? ");
        int turmas = scanner.nextInt();

        int total = 0;

        for (int i = 1; i <= turmas; i++) {
            System.out.print("Quantos alunos na turma " + i + "? ");
            int alunos = scanner.nextInt();

            while (alunos > 40) {
                System.out.println("Uma turma não pode ter mais de 40 alunos. Digite novamente.");
                System.out.print("Quantos alunos na turma " + i + "? ");
                alunos = scanner.nextInt();
            }

            total += alunos;
        }

        double media = (double) total / turmas;

        System.out.println("A média de alunos por turma é: " + media);

        scanner.close();
    }
}
