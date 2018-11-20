public class fibonacci {

    public static void main(String[]args){
        System.out.println("Fibonacci Number from 0 to 7");
    display();
        
    }static int fact(int n){
        if(n <= 1) return 1;
        else return n * fact(n - 1);
    }
    
    static void nested(){
        for(int i = 1; i <= 7; i++){
        System.out.println(fact(i));
    }
        
    }
    static void display(){
        for(int i = 0; i < 7; i++){
            for(int m = 1; m <= i; m++){
                
                System.out.print(fact(m) + " ");
            }
            System.out.println(" ");
        }    
    }
	}