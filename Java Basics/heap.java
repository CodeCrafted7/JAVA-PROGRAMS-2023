import java.util.*;

class heap1 {
    Scanner sc = new Scanner(System.in);
    int maxsize;
    int heapsize = 0;

    public void heap12(int max) {
        maxsize = max;
    }

    public int rchild(int i) {
        return (2 * i) + 2;
    }

    public int lchild(int i) {
        return (2 * i) + 1;
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }




    public int insert(int num, int heapsize) {
        int i;
        int arr[] = new int[maxsize];
        for (i = 0; i < heapsize - 1; i++) {
            arr[i] = sc.nextInt();
        }

        if (heapsize == maxsize) {
            System.out.println("Heap Overflow : ");
            return 0;
        }
        heapsize++;
        while (i != 0 && arr[heapsize - 1] > arr[parent(i)]) {
            int temp = arr[heapsize - 1];
            arr[heapsize - 1] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
        arr[i] = num;
        return 1;
    }




    public  static void print(int arr[],int heapsize)
    {
          System.out.println("After sorting : ");
        for (int i = 0; i < heapsize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class heap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the MaximuArray : ");
        int max = sc.nextInt();
        heap1 h = new heap1();
        h.heap12(max);
        System.out.println("Enter the size of the Array : ");
        int heapsize = sc.nextInt();
        h.insert(5, heapsize);
        h.insert(6, heapsize);
        h.insert(7, heapsize);
        h.insert(8, heapsize);
        h.insert(9, heapsize);
        h.insert(9, heapsize);
        h.insert(10, heapsize);

    }
}
