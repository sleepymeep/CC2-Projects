import java.util.Scanner;
public class ActivityFive { 
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        //ask for number
        System.out.println("Enter Number");
        int num = 11;
        System.out.println("Guess 0-1000");
        //default number
          int guess = 0;
  
           while(guess != num ){
               System.out.println("Enter your Number");
               guess=keyboard.nextInt();
               
               if(guess > num) {
                   System.out.println("The number you put is high");
                   
                   
               } else if(guess < num){
                   System.out.println("The number you put is low");
                }
               else if(guess == num){
                   System.out.println("The number is correct");
            }
                 if(num %2 ==0){
               System.out.println("even number");
           }else{
               System.out.println("odd number");
           }
           }
        }
}