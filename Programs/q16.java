import java.util.*;
public class q16 {
    public static void main(String[] args) {
        int i,j,inv=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                inv++;
            }
        }
        System.out.println("Total number of inversions is : "+ inv);
    }
}
