import java.util.Scanner;

public class atividade7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int highestNumber = Integer.MIN_VALUE;
        int number;

        for (int i = 0; i < 5; i++){
            System.out.println("Type five numbers here: ");
            number = scanner.nextInt();
            if(number > highestNumber){
                highestNumber = number;
            }
        }
        System.out.println("The highest number is " + highestNumber);

        scanner.close();
    }
}
