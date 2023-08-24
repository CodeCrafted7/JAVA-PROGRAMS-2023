import java.util.*;

public class q33 {
    public static void minswap(int arr[], int n, int k) {
        int fav = 0, nfav = 0;
        int i = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] <= k)
                fav++;
        }
        for (int j = 0; j < fav; j++) {
            if (arr[j] > k)
                nfav++;
        }
        int l = 0;
        int r = fav - 1;
        int res = Integer.MAX_VALUE;
        while (r < n) {
            res = Math.min(res, nfav);
            r++;
            if (r < n && arr[r] > k)
                nfav++;
            if (l < n && arr[l] > k)
                nfav--;
            l++;
        }
        System.out.println("Minimum Number of Swaps is : " + res);
    }

    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the Array : ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        minswap(arr, n, k);
    }
}
