import java.util.Scanner;

public class atividade22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = s.nextInt();

        if (isPrimo(n)) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo. Ele é divisível por:");
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        }

        s.close();
    }

    public static boolean isPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
