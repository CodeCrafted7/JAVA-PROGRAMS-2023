import java.util.*;

public class q41 {
    public static void Sortmatrix(int arr[][], int n) {
        int a[] = new int[n * n];
        int k = 0;
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[k++] = arr[i][j];
            }
        }
        Arrays.sort(a);
        k = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = a[k++];
            }
        }
        System.out.println("After Sorting : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
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
        Sortmatrix(arr, n);
    }
}
