package userpassword;
import java.util.Scanner;
public class UserPassword {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        String s1;

        System.out.println("Input Username:");
        username = sc.nextLine();
        System.out.println("Input Password:");
        password = sc.nextLine();
                
        System.out.println("Input your Password again: ");
        s1 = sc.nextLine();

        
        if (s1.equals(password)){
            System.out.println("Correct Password: " + s1);
        } else {
            System.out.println("Invalid Password: " + s1);
        }

    }
}