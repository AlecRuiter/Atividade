import java.util.Scanner;

public class atividade20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite um número inteiro positivo menor que 16 para calcular o fatorial: ");
            int num = scanner.nextInt();

            if (num < 0 || num >= 16) {
                System.out.println("Digite um número entre 0 e 15.");
                continue;
            }

            int fatorial = calcularFatorial(num);

            System.out.println(num + "! = " + fatorial);

            System.out.print("Deseja calcular o fatorial de outro número? (s/n): ");
            continuar = scanner.next().charAt(0);
        }

        scanner.close();
    }

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
