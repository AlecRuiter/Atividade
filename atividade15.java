import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();

        System.out.println("Série de Fibonacci até o " + n + " termo:");

        for (int i = 1; i <= n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int Fibonacci = 1, prevFibonacci = 1;
        for (int i = 2; i < n; i++) {
            int temp = Fibonacci;
            Fibonacci += prevFibonacci;
            prevFibonacci = temp;
        }
        return Fibonacci;
    }
}
