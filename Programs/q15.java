import java.util.*;

public class q15 {
    public static void np(int arr[]) {
        int i;
        int n = arr.length;
        int k = n - 2;
        if (n == 0 || arr == null)
            return;
        for (i = n - 1; i > 0; i--) {
            if (arr[i] <= arr[i - 1])
                k--;
            else
                break;
        }
        if (k == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        for (i = n - 1; i > 0; i--) {
            if (arr[i] > arr[k]) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        reverse(arr, k + 1, n - 1);
    }

    public static void reverse(int arr[], int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        np(arr);
        System.out.print("Next Permutation : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
