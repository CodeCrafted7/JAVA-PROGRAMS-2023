import java.util.*;
public class insertionsort {
    public static void Insertionsort(int arr[])
    {
        int n=arr.length;
        int i,j,key;
        for(i=1;i<n;i++)
        {
            key = arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]  =key;
        }
        System.out.println("After sorting : ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Insertionsort(arr);
    }
}
