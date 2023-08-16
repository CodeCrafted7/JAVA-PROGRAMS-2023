import java.util.*;

public class q3 {
    public static void main(String[] args) {
        int i, j,n, temp, k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Arrray :- ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println();
        System.out.print("Enter the Elements of the Array :- ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Kth Element :- ");
        k = sc.nextInt();
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Maximum kth Element :- " + arr[k + 1]);
        System.out.println("Minimum kth Element :- " + arr[k - 1]);
    }
}
