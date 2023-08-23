import java.util.*;
public class q30 {
    public static int Choclatedp(int arr[],int n ,int m)
    {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++)
        {
            int diff = arr[i+m-1]-arr[i];
            if(diff<min)
              min = diff;
        }
        return min;
    }
    public static void main(String[] args) {
        int i = 0;
        int m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the Array : ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the Choclate : ");
        m = sc.nextInt();
        
        int ans = Choclatedp(arr,n,m);
        System.out.println("Mininmum Choclate Recived is : "+ans);
    }
}
