import java.util.*;
public class bubblesort {
    public static void Bubblesort(int arr[])
    {
        int n = arr.length;
        int i,j,temp=0;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  =temp;
                }
            }
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
        System.out.println("Enter the Size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Bubblesort(arr);
    }
}
