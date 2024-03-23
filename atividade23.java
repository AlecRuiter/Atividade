import java.util.Scanner;

public class atividade23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        int divisoes = 0;

        System.out.println("Números primos entre 1 e " + n + ":");

        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
            divisoes++;
        }

        System.out.println("Número de divisões: " + divisoes);

        scanner.close();
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
