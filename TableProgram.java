package tableprogram;
public class TableProgram {
    public static void main(String[] args) {

        int a[] = {3, 9, 15, 20, 65, 23, 18, 4, 2, 21,};
        System.out.println("Odd Numbers");
        for(int i = 1; i<a.length;i++){
            if(a[i]%2!=1){
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers");
         for(int i = 1; i<a.length;i++){
            if(a[i]%2==1){
                System.out.println(a[i]);
            }
    }
}
}