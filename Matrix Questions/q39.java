import java.util.*;
public class q39 {
    public static int median(int arr[][],int R,int C)
    {
        int[] a = new int[R*C];
        int k = 0;
        for(int i = 0; i<R; i++){
            for(int j = 0; j<C; j++){
                a[k] = arr[i][j];
                k++;
            }
        }
        
        Arrays.sort(a);
        
        return a[(R*C)/2];
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
        int ans = median(arr,n,n);
        System.out.println("The Median of the Matrix is : "+ans);
    }
}
