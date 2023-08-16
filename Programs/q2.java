import java.util.*;

public class q2 {
    public static void main(String[] args) {
        int i, max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array :- ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of the array :- ");
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for (i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Element in the Array is :- " + max);
        System.out.println("Minimum Element in the Array is :- " + min);
    }
}
