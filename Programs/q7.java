import java.util.*;

public class q7 {
    public static void main(String[] args) {
        int i, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        temp = arr[n - 1];
        for (i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println("Array After Roatation : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
