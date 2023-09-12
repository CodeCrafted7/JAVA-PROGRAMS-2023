import java.util.*;
import java.lang.*;
public class p5{
    public static void main(String[] args){
        System.out.print("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++)
            System.out.println("2^" + i + " = " + (int)Math.pow(2,i));
        sc.close();
    }
}
