package fact;
import java.util.Scanner;
public class Fact {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("====Create an array====");
        System.out.println("Enter Size of an Array: ");
        byte size= sc.nextByte();
        int [] arr = new int [size];
        for(int i=0; i<arr.length; i++){
            System.out.println("element["+i+"]:");
            arr[i] =sc.nextInt();
            
        }
        
        System.out.println("This is your array:");
        for (int j=0; j<arr.length; j++){
            System.out.println(arr[j]+",");
        }
        System.out.println("\n Where do you want to go? Factorial or Fibonacci? "
                + "\n(enter number)"
                + "\n[1]Factorial"
                + "\n[2] Fibonacci");
        byte choice;
        choice = sc.nextByte();
        
        if (choice ==1){
            displayFacto(arr);
        
        }else if (choice==2){
            displayFibo(arr);
        }
        
        }static int factorial(int m){
            if(m<=1){return m;}
            else{return factorial(m - 1) + (m - 2);}
        }static void displayFacto(int [] arr){
            for (int i=0; i < arr.length; i++){
                System.out.println("f(" + arr[i] + ") " + " = " + factorial(arr[i]));
            }
        }static void displayFibo(int [] arr){
            for(int i = 0; i < arr.length; i++){
                System.out.println("f(" + arr[i] + ") " + " = " + fibonacci(arr[i]));
            }

        }static int fibonacci(int n){
            if (n<= 1) return 1;
            else return n* fibonacci(n-1);
            }
        
        static void nested(){
            for(int i=0; i<=5; i++){
                System.out.println(fibonacci(i));
            } 
        }
        static void display(){
            for (int i = 0; i<= 5; i++){
                for(int n = 1; n <= i; n++){
                System.out.println(fibonacci(n) + "f("+")");
                break;
            }
        }
    }
}