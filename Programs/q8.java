import java.util.*;
public class q8 {
    public static void main(String[] args) {
        int i,sum=0,maxi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        maxi = arr[0];
        for(i=0;i<n;i++)
        {
            sum = sum+arr[i];
            maxi = Math.max(maxi,sum);
            if(sum<0)
              sum = 0;
        }
        System.out.println("Largest sum contiguous Subarray is : "+ maxi);
    }
}
