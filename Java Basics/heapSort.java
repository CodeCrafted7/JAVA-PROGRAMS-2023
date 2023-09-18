import java.util.*;

public class heapSort {
    public static void Heapsort(int[] arr, int n) {

        for (int i = n / 2 - 1; i >= 0; i--) {
            Heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            Heapify(arr, i, 0);
        }
        System.out.println("After Heap sort : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void Heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[largest] < arr[l])
            largest = l;

        if (r < n && arr[largest] < arr[r])
            largest = r;

        if (largest != i) {
            swap(arr, i, largest);
            Heapify(arr, n, largest);
        }
    }

    public static void swap(int arr[], int i, int largest) {
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elemenets : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Heapsort(arr, n);
    }
}
