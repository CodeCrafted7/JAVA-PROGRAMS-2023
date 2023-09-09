import java.util.*;

public class q45 {
    public static int kthSmallest(int[][] mat, int n, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                al.add(mat[i][j]);
            }
        }
        Collections.sort(al);
        return al.get(k - 1);
    }

    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Matrix : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter the elements of the Matrix : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Kth smallest element index : ");
        int k = sc.nextInt();
        int ans = kthSmallest(arr, n, k);
        System.out.println("Kth Smallest Element is : " + ans);
    }
}
