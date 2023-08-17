import java.util.*;
public class q18 {
    public static void main(String[] args) {
        int i,j,k;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the Array : ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the kth Element : ");
        k = sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==k)
                   count++;
            }
        }
        System.out.println("Total kth elements present in Array is : "+count);
    }
}
