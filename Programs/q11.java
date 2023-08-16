import java.util.*;
public class q11 {
    public static void main(String[] args) {
        int  i,index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int  n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            index = Math.abs(arr[i]);
            if(arr[index]<0)
            System.out.println("Duplicate element is : " + index);
            arr[index] = -arr[index];
        }
    }
}
