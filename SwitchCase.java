public class SwitchCase {
    public static void main(String[]args){
        char emotion = 'B';
        
        switch(emotion){
            case 'A':
                System.out.println("Meep!");
                break;
            case 'B':
                System.out.println("Meh...");
                break;
            case 'C':
                System.out.println("Noo....");
                break;
            default:
                System.out.println("Im'a lazy...");
        }
        System.out.println("Your emotion now is: " + emotion);
    }
}