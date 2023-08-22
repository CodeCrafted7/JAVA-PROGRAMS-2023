import java.util.*;
public class q27 {
    public static void main(String[] args) {
        int i ,j;
        int c=0;
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Size of the Array 1 : "); 
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the elements of the Array 1 : ");
        for(i=0;i<n;i++)
         arr[i] = sc.nextInt();

        System.out.println("Enter the Size of the Array 2 : "); 
        int m = sc.nextInt();
        int arr1[] = new int [m];
        System.out.println("Enter the elements of the Array 2 : ");
        for(i=0;i<m;i++)
         arr1[i] = sc.nextInt();
         Arrays.sort(arr);
         Arrays.sort(arr1);
         for(i=0;i<m;i++)
         {
            for(j=0;j<n;j++)
            {
                if(arr1[i] == arr[j])
                c++;
            
            }
         }
         if(c==n)
           System.out.println("Yes");
           else
           System.out.println("No");
    }
}
