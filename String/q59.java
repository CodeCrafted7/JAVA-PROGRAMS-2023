import java.util.*;
public class q59 {
    public static int Convert(String a,String b)
    {
        int m = a.length();
        int n = b.length();
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<m;i++) dp[i][0] = i;
        for(int j=0;j<n;j++) dp[0][j] = j;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                dp[i][j]=dp[i-1][j-1];
                else
                 dp[i][j] = 1+Math.min(  Math.min(dp[i][j-1],dp[i-1][j]) ,dp[i-1][j-1]);                   
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the String 1 : ");
        String a = sc.next();
        System.out.println("Enter the String 2 : ");
        String b = sc.next();
       int res = Convert(a,b);
       System.out.println("The Minimum No. of operation Required to convert the String1 to String2 are : "+res);
    }
}
