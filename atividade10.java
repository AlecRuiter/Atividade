import java.util.Scanner;

public class atividade10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um numero: ");
        int numero1 =  scanner.nextInt();

        System.out.println("Escreva outro numero: ");
        int numero2 = scanner.nextInt();

        for (int i = numero1; i <= numero2; i++) {
            System.out.println(" ");
            System.out.println(i);
        }
        
        scanner.close();
    }
}
