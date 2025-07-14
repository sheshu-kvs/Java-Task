
import java.util.*;
public class dem4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int n=scan.nextInt();
        countNumbers(n);
        
    }
    private static void countNumbers(int n){
        int count=0;
        while(n>0){
            int rem=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
