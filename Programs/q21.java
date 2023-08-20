import java.util.*;
public class q21 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the array : ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elemenet which subarray sum you want to find : ");
        int k = sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum =+arr[i];
            if(sum==k)
              res++;
            if(!map.containsKey(sum))
            map.put(sum,0);
            map.put(sum,map.get(sum)+1);
        }
        System.out.println("Number of subarray with sum equal to "+k+" is : "+res);
    }
}
