import java.util.*;
import java.util.Scanner;
public class q40 {
    public static int findone(int arr[][],int r,int c)
    {
        int n=r;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=c-1;j>=0;j--)
            {
                if(arr[i][j]==1)
                {
                  ans=i;
                  c--;
                }
                else
                   break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Matrix : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int i = 0, j = 0;
        System.out.println("Enter the Elements of the Matrix : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = findone(arr,n,n);
        System.out.println("Maxixmum number of One's is : "+ans);
    }
}
