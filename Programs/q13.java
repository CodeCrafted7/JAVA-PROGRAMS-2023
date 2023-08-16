import java.util.*;
public class q13 {
    public static void main(String[] args) {
        int i;
        int csum = 0;
            int bsum = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size  of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for( i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            
            csum = Math.max(arr[i],csum+arr[i]);
            bsum = Math.max(csum,bsum);
        }
        System.out.println("The Maximum sum of Contiguous subarray is/Kadane's Algorithm is  : " + bsum);
    }
}
