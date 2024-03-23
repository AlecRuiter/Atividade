import java.util.Scanner;

public class atividade12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número entre 1 a 10: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido! Por favor, insira um número entre 1 e 10.");
        } else {
            System.out.println("Tabuada de " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int multiplicacao = numero * i;
                System.out.println(numero + " X " + i + " = " + multiplicacao);
            }
        }


        
        scanner.close();
    }
}
