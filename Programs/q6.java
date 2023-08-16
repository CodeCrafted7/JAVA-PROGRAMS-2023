import java.util.*;

public class q6 {
    public static void union(int a[], int b[], int n, int m) {
        int i = 0, j = 0;
        System.out.println("Union of Two Arrays is  : ");
        while (i < n & j < m) {
            if (a[i] < b[j])
                System.out.print(a[i++] + " ");
            else if (a[i] > b[j])
                System.out.print(b[j++] + " ");
            else {
                System.out.print(b[j++] + " ");
                i++;
            }
        }
        while (i < n)
            System.out.print(a[i++] + " ");
        while (j < m)
            System.out.print(b[j++] + " ");
    }

    public static void intersection(int a[], int b[], int n, int m) {
        int i = 0, j = 0;
        System.out.println("Intersection of Two Arrays is  : ");
        while (i < n & j < m) {
            if (a[i] < b[j])
                i++;
            else if (a[i] > b[j])
               j++;
            else {
                System.out.print(b[j++] + " ");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array 1 : ");
        int n = sc.nextInt();
        System.out.println("Enter the Size of the Array 2 : ");
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        System.out.println("Enter the elements of the Array 1 : ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the Array 2 : ");
        for (j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        union(a, b, n, m);
        System.out.println();
        intersection(a,b,n,m);

    }
}
