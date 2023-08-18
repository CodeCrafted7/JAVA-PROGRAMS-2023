import java.util.*;

public class q19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> res = new ArrayList<Integer>();
        System.out.println("Enter the size of the array 1 :");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of the array 2 :");
        int n2 = sc.nextInt();
        System.out.println("Enter the size of the array 3 :");
        int n3 = sc.nextInt();
        int a[] = new int[n1];
        int b[] = new int[n2];
        int c[] = new int[n3];
        int i, j, k;
        System.out.println("Enter the Elements of the Array 1 : ");
        for (i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Elements of the Array 2 : ");
        for (j = 0; j < n2; j++) {
            b[j] = sc.nextInt();
        }
        System.out.println("Enter the Elements of the Array 3 : ");
        for (k = 0; k < n3; k++) {
            c[k] = sc.nextInt();
        }

        int temp;
        while (i < n1 && j < n2 && k < n3) {
            if (a[i] == b[j] && b[j] == c[k]) {
                res.add(a[i]);
                temp = a[i];
                i++;
                j++;
                k++;
                while ((i < n1 && j < n2 && k < n3) && (a[i] == b[j] && b[j] == c[k]) && a[i] == temp)
                    res.add(a[i]);
                continue;
            } else if (b[j] < c[k])
                j++;
            else if (a[i] < c[k])
                i++;
            else
                k++;
        }
        for (i=0;i<res.size();i++) {
            System.out.println(res.get(i));
        }
    }
}
