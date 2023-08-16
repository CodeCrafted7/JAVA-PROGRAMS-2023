import java.util.*;
public class q5 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of the Array : ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Array After sorting : ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
