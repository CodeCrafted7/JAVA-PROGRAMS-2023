import java.util.*;
public class p2 {    
    public static void main (String[] args)
      {
        Scanner sc = new Scanner(System.in);
        int i,j,x=1;
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        for(i=0 ;i<n; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
        sc.close();
    }   
}
