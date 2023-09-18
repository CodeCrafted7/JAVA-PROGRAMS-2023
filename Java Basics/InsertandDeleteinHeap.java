import java.util.*;
public class InsertandDeleteinHeap {
	public static void heapify(int arr[], int n, int i)
	{
		int largest = i;
		int l = 2 * i + 1; 
		int r = 2 * i + 2; 
		if (l < n && arr[l] > arr[largest])
			largest = l;
		if (r < n && arr[r] > arr[largest])
			largest = r;

		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			heapify(arr, n, largest);
		}
	}

	public static int deleteRoot(int arr[], int n) {
		if (n <= 0) {
			System.out.println("Heap is empty");
			return n;
		}
	
		int lastElement = arr[n - 1];
		arr[0] = lastElement;
		n = n - 1;
		heapify(arr, n, 0);
		return n;
	}
	

	public static void printArray(int arr[], int n)
	{
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

    public static int insertNode(int[] arr, int n, int Key)
    {
        n = n + 1;
        arr[n - 1] = Key;
        heapify(arr, n, n - 1);
        return n;
    }

	public static void main(String args[])
	{
		int arr[] = { 10, 5, 3, 2, 4 };
		int n = arr.length;
        n = insertNode(arr, n, 15);
		n = deleteRoot(arr, n);
		printArray(arr, n);
	}
}
