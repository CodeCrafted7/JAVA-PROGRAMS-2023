import java.util.*;

public class q9 {
    public static void main(String[] args) {
        int min, max, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        Arrays.sort(arr);
        int minEle, maxEle;
        int result = arr[n - 1] - arr[0];
        for (i = 1; i < n; i++) {
            if (arr[i] >= k) {
                maxEle = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                minEle = Math.min(arr[0] + k, arr[i] - k);
                result = Math.min(result, maxEle - minEle);
            }
        }
        System.out.println("Minimum difference : " + result);
    }

}


















