import java.util.*;
public class q32 {
    public static void swap(int arr[],int l ,int r)
    {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void partition(int arr[],int n,int a,int b)
    {
        int l=0;
        int r=n-1;
        int i=0;
        for(i=0;i<=r;i++)
        {
            if(arr[i]<a){
                swap(arr,l,i);
                l++;
            }
            else if(arr[i]>b)
            {
                swap(arr,r,i);
                r--;
                i--;
            }
        }
        System.out.println("After Partition : ");
         for (i = 0; i < n; i++)
         System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the Array : ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the Value of a : ");
        int a = sc.nextInt();
         System.out.println("Enter the Value of b : ");
        int b = sc.nextInt();
        partition(arr,n,a,b);
    }
}
