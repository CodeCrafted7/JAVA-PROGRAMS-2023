import java.util.*;
public class q54 {
    public static int LongestSubsequence(String str)
    {
        int n = str.length();
        int t[][] = new int[n+1][n+1];
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(str.charAt(i-1) == str.charAt(j-1) && i!=j)
                {
                    t[i][j] = t[i-1][j-1]+1;
                }
                else
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
            }
        }
         return t[i][j];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        LongestSubsequence(str);
    }
}
