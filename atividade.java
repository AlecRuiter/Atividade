    import java.util.Scanner;
    
    public class atividade {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String  username;
        String password;
        
        do{
            System.out.println("Type your username:");
            username = read.nextLine();
            System.out.println("Type your password: ");
            password = read.nextLine();
            

            if(username.equals(password)){
                System.out.println("You can't use your usarname as a password!");}

        } while (username.equals(password));

        read.close();
        

    }
}
