import java.util.*;
public class p4 
{
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Value of n : ");
    int n = sc.nextInt();
    int i;
    for(i=0;i<=n;i++)
    {
        System.out.println("2^" + i +"="+(int)Math.pow(2,i));
    }
    sc.close();
}
}
