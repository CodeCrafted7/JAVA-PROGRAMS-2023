import java.util.*;

public class q28 {
    public static boolean triplet(int arr[], int n, int x) {
        for (int i = 0; i < n - 2; i++) {
            int remsum = x - arr[i];
            boolean ans = Twosum(remsum, i - 1, n, arr);
            if (ans)
                return true;
        }
        return false;
    }

    public static boolean Twosum(int remsum, int s, int e, int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = s; i <= e; i++)
            map.put(arr[i], i);
        for (int i = s; i <= e; i++) {
            int r = remsum - arr[i];
            if (map.containsKey(r) && map.get(r) != i)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the  Array : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Sum of Triplets  : ");
        int x = sc.nextInt();
        boolean anss = triplet(arr, n, x);
        if (anss == true)
            System.out.println("Triplets Presents :) ");
        else
            System.out.println("No Triplets Presents :) ");
    }
}
