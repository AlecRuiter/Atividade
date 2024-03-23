import java.util.Scanner;

public class atividade8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        double media;
        int contador = 0;

        System.out.println("Digite cinco numeros: ");

        while(contador < 5){
            int numero= scanner.nextInt();
            soma += numero;
            contador++;
        }

        media = (double) soma /5;

        System.out.println("A soma dos numeros e " + soma);
        System.out.println("A media dos numeros e " + media);
        



        scanner.close();
    }
}
