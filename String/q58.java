import java.util.*;
public class q58 {
        public static int solveWordWrap (int[] nums, int k)
        {
            Integer[] dp = new Integer[k+1];
            return recur(nums, k, 0, dp);
        }
        
        public static int recur(int[] arr, int k, int i, Integer[] dp){
            if(dp[i]!=null)
                return dp[i];
            
            if(i>=arr.length){
                return dp[i] = 0;
            }
            
            int maxChars = k;
            int count = 0;
            int cost = Integer.MAX_VALUE;
            
            for(int j=i;j<arr.length;j++){
                maxChars -= arr[j];
                count++;
                if(count >= 2){
                    maxChars--;
                }
                
                if(maxChars>=0){
                    if(j==arr.length-1){
                        cost=0;
                    }
                    else{
                        cost = Math.min(cost, (maxChars*maxChars) + recur(arr, k, j+1, dp));
                    }
                }
                else{
                    break;
                }
            }
            
            return dp[i] = cost;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the word size Array : ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the No of words in a Particular line : ");
        int k = sc.nextInt();
         solveWordWrap(arr,k);
    }
    
}
