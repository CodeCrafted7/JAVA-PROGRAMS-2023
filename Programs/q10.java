import java.util.*;
public class q10 {
    public static void main(String[] args) {
        int i,jump=0,des=0,pos=0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the Array : ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            des  = Math.max(arr[i]+i , des);
            if(pos==i)
            {
                pos = des;
                jump++;
            }
        }
        System.out.println("Minimum Number of jump Required is : " + jump);
    }
}
