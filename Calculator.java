package calculator;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        
        int num1;
        int num2;
        String operator;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Imput First Number: ");
        num1 = input.nextInt();

        System.out.println("Imput Second Number: ");
        num2 = input.nextInt();
        
        System.out.println("Select Arithmetic Operator: ");
        operator = input.next();
       
        
        if (operator.equals("+")){
            System.out.println("your answer is: " + (num1 + num2));
        }
        else if (operator.equals("-")){
            System.out.println("your answer is: " + (num1 - num2));
        }

        else if (operator.equals("*")){
            System.out.println("your answer is: " + (num1 / num2));
        }
        else if (operator.equals("/")) {
            System.out.println("your answer is: " + (num1 * num2));                       
        }
        else if (operator.equals("%")){
            System.out.println("your answer is: " + (num1 % num2));
        }
            
    }  
}