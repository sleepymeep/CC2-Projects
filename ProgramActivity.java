package programactivity;
import java.util.*;
public class ProgramActivity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Imput your Name: ");
        String name = sc.nextLine();
        
        System.out.println("Input your Course: "
                + "\n[1] IT"
                + "\n[2] CS"
                +"\n (Input the number)");
        byte course;
        course = sc.nextByte();
        byte major;
        
        if (course == 1){        
             System.out.println("Input your Major: "
                + "\n[1] Network Security"
                + "\n[2] Web Development"
                + "\n[3] Entrepneurship"
                +"\n (Input the number)");
            major = sc.nextByte();
            if (major == 1){
                System.out.println("Greetings: " + name + " of BSDA major in " + "Netword Security");
            }else if (major == 2){
                System.out.println("Greetings: " + name + " of BSDA major in " + "Web Development");
            }else if (major == 3){
                System.out.println("Greetings: " + name + " of BSDA major in " + "Entrepneurship");
            }
        } else if (course == 2){
            System.out.println("Input your Major: "
                    + "\n[1] Mobile Development"
                    + "\n[2] Digital Arts and Animation"
                    +"\n (Input the number)");
            major = sc.nextByte();
            if (major == 1){
                System.out.println("Greetings: " + name + " of BSDA major in " + "Mobile Development");
            }else if (major == 2){
                System.out.println("Greetings: " + name + " of BSDA major in " + "Digital Arts and Animation");
                
            }   }
}
    }
    