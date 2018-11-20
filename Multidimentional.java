package multidimentional;
import java.util.Arrays;
import java.util.Scanner;
public class Multidimentional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Imput a Number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Imput a Number of Columns: ");
        int columns = sc.nextInt();
        int [] [] ar = new int[rows][columns];
        
        int i = 0;
        int ii = 0;
        while(i < columns){
            System.out.println("Columns: " + i);
            while(ii < ar.length){
                System.out.println(" (Enter Number Again) ");
                System.out.println("Row: " +ii);
                ar[ii] [i] = sc.nextInt();
                ii++;
            }
            
            i++;
            ii = 0;
        }
        System.out.println("Your Array is: " + Arrays.deepToString(ar));
  }
}