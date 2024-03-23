import java.util.Scanner;

public class atividade11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um numero: ");
        int numero1 =  scanner.nextInt();

        System.out.println("Escreva outro numero: ");
        int numero2 = scanner.nextInt();

        int soma = 0;

        for (int i = numero1; i <= numero2; i++) {
            System.out.println(" ");
            System.out.println(i);
            soma += i;
        }

        System.out.println("A soma dos numeros e" + soma);
        
        scanner.close();
    }
}
