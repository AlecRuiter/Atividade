public class atividade16 {
    public static void main(String[] args) {
        int termoinciial = 0;
        int segundovalor = 1;
        int terceirovalor = termoinciial + segundovalor;

        System.out.println("Série de Fibonacci até que o valor seja maior que 500:");

        System.out.print(termoinciial + " " + segundovalor + " ");

        while (terceirovalor <= 500) {
            System.out.print(terceirovalor + " ");
            termoinciial = segundovalor;
            segundovalor = terceirovalor;
            terceirovalor = termoinciial + segundovalor;
        }
    }
}
