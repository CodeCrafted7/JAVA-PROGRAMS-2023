import java.util.*;
public class q31 {
    public static int smallsumarr(int arr[],int n,int x)
    {
        int s=0,e=1;
        int res = Integer.MAX_VALUE;
        int sum = arr[s];
        if(sum>x)return 1;
        if(e<n) sum+=arr[e];
        while(s<n && e<n)
        {
            if(sum>x)
            {
                res = Math.min(res,e-s+1);
                sum-=arr[s];
                s++;
            }
            else{
                e++;
                if(e<n)
                {
                    sum+=arr[e];
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int i = 0;
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the Array : ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the Value of X : ");
        x= sc.nextInt();
        int ans = smallsumarr(arr,n,x);
        System.out.println("Smallest Subarray is : "+ans);
    }
}
