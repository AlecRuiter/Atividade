import java.util.Scanner;

public class atividade13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = scanner.nextInt();

        System.out.println("Digite o expoente: ");
        int expoente = scanner.nextInt();

        int resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.println();
        System.out.println(resultado);
        scanner.close();
    }
}
