import java.util.*;
public class q24 {
    public static void LongestConsequtiveSubsequence(int arr[],int n)
    {
        int ans=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr)
          set.add(i);
        for(int i=0;i<n;i++)
        {
            if(!set.contains(arr[i]-1)){
                int j = arr[i]+1;
                while(set.contains(j))
                  j++;
               ans = Math.max(ans,j-arr[i]);
            }
        }
        System.out.println("Longest Consequtive Subsequence is : "+ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        LongestConsequtiveSubsequence(arr,n);
    }
}
