
import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numPar = 0;
        int numImpar = 0;

        System.out.println("Digite 10 números inteiros:");
        
        for (int contador = 0; contador < 10; contador++) {
            System.out.print("Digite o " + (contador + 1 )  + " primeiro: ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                numPar++;
            } else {
                numImpar++;
            }
        }
    
        System.out.println("Quantidade de números pares: " + numPar);
        System.out.println("Quantidade de números ímpares: " + numImpar);

    }
}
