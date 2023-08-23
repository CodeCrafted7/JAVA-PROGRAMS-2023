import java.util.*;
public class q29 {
    public static int rainwater(int arr[],int n)
    {
        int i;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        for(i=1;i<n;i++)
        {
            left[i] = Math.max(left[i-1],arr[i]);
        }
        right[n-1]  = arr[n-1];
        for(i=n-2;i>=0;i--)
        {
            right[i] = Math.max(right[i+1],arr[i]);
        }
        int ans=0;
        for(i=0;i<n;i++)
        {
            ans+= (Math.min(left[i],right[i])-arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int i=0;
        int ans=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the Array : ");
        for(i=0;i<n;i++)
        arr[i] = sc.nextInt();
        ans = rainwater(arr,n);
        System.out.println("Trapped Rain Water block is : "+ans);
    }
}
