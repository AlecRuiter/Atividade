import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        double salary;
        String gender;
        String maritalStatus;

        do{
            System.out.println("Type your name(more than 3 charapters): ");
            name =scanner.nextLine();

            System.out.println("Type your age: ");
            age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Type your salary: ");
            salary = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.println("Type yor gender: ");
            gender = scanner.nextLine();

            System.out.println("Your marital status: ");
            maritalStatus =  scanner.nextLine();


            
            if(name.length() < 3){
                System.out.println("Type a name with more than 3 characters");
            if(age < 0 || age > 150){
                System.out.println("The age must be older than 0 and youngest than 150 years old");
            }if (!gender.equalsIgnoreCase("S") && !gender.equalsIgnoreCase("M")){
                System.out.println("You gender must be M or F ");
            }if (!maritalStatus.equalsIgnoreCase("S") && !maritalStatus.equalsIgnoreCase("C") && !maritalStatus.equalsIgnoreCase("V") && !maritalStatus.equalsIgnoreCase("D")){
                System.out.println("You gender must be M or F ");
            }

            }  } while (name.length() < 3 || age <= 0 || age > 150 || (!gender.equalsIgnoreCase("S") && !gender.equalsIgnoreCase("M")) || (!maritalStatus.equalsIgnoreCase("S") && !maritalStatus.equalsIgnoreCase("C") && !maritalStatus.equalsIgnoreCase("V") && !maritalStatus.equalsIgnoreCase("D")));

            
    }
}
