import java.util.*;

public class q17 {
    public static void maxprofit(int arr[])
    {
        if(arr.length==0)
           return;
        int profit = 0;
        int min = arr[0];
        int max = 0;
        int sp;
        for(sp=0;sp<arr.length;sp++)
        {
            min = Math.min(min,sp);
            profit = sp-min;
            max = Math.max(max, profit);
        }
        System.out.println("Highest price is : "+max);
    }
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxprofit(arr);
    }
}
