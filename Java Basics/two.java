import java.util.*;
public class two {
    public static void main(String[] args) {
       int x=1,i,j;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of rows : ");
       int n = sc.nextInt();
       for(i=0;i<n;i++)
       {
        for(j=0;j<=i;j++)
        {
            System.out.print(x+" ");
            x++;
        }
        System.out.println();
       } 
    }
}
