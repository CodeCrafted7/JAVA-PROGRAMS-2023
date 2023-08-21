import java.util.*;
public class q23 {
     public static void swap(int m,int n)
     {
        int temp = m;
        m=n;
        n=temp;
     }
    public static void main(String[] args) {
        int i;
        int ans=0;
        int max=0,min=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
        
            if(arr[i]<0)
               swap(max,min);
            max = Math.max(arr[i],max*arr[i]);
            min = Math.min(arr[i],min*arr[i]);
            ans = Math.max(ans,max);
        }
       // int ans;
        System.out.println("Maximum Subarray Product is  : "+ans);
    }
}
