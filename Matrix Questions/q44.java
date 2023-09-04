import java.util.*;
public class q44 {
    public static void rotate(int[][] mat)
    {
        int n = mat.length;
        int i,j,temp;
        for( i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

       for( i=0;i<n;i++)
        {
            for( j=0;j<n/2;j++)
            {
                 temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
        System.out.println("After 90 Degree Rotation : ");
        for( i=0;i<n;i++)
        {
            for( j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
             System.out.println();
        }



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
        rotate(arr);
    }
}
