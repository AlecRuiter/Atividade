import java.util.Scanner;

public class atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um numero inteiro para que eu calcule o valor fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = calculoFatorial(numero);

        System.out.println(numero + "! = " + fatorial);

        scanner.close();
    }

    public static int calculoFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int resultado = 1;
            for (int contador = 2; contador <= n; contador++) {
                resultado *= contador;
            }
            return resultado;
        }
    }
}
