import java.util.*;
public class q60 {
    public static void permute(int[] arr)
    {
        if(arr==null || arr.length<=1) return;
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]) i--;
        if(i>=0)
        {
            int j = arr.length-1;
            while(arr[j]<=arr[i]) j--;
            swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);
        System.out.println("Next Mininmum Permutation is : ");
        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    
    }
    public static void reverse(int[] arr,int i,int j)
    {
        while(i<j)
        swap(arr,i++,j--);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Array : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        permute(arr);
    }
}
