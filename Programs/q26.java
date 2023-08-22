import java.util.*;
public class q26 {
    public static void main(String[] args) {
        int i;
        int ma=0;
        int mi = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int dp[] = new int[n];
        System.out.println("Enter the Elements of the  Array : ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=n-2;i>=0;i--)
        {
            if(arr[i]>ma)
             ma = arr[i];
             dp[i] = Math.max(dp[i+1],ma-arr[i]);
        }
        for(i=1;i<n;i++){
            if(arr[i]<mi)
              mi = arr[i];
              dp[i] = Math.max(dp[i-1],dp[i]+(arr[i]-mi));
        }
        System.out.println("Maximum profit Earned is : "+dp[n-2]);

    }
}
