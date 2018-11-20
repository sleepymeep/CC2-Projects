package fibonnaciarray;

public class FibonnaciArray {

    public static void main(String[] args) {
        int x[] = {1, 5, 3, 4, 2};
        display(x);
    }
    
    static int fact(int n){
        if(n <= 1) return n;
        else return fact(n - 1) + fact(n - 2);
    }
    
    static void display(int [] arr){
        for(int i = 0; i < arr.length; i ++){
        System.out.println("f(" + arr[i] + ")" + fact(arr[i]));
    }
    }
    
}
