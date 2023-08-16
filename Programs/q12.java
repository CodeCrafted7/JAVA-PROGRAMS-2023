import java.util.*;
public class q12 {
    public static void SortArray(int b[]){
        int i;
        for(i=0;i<b.length;i++)
        {
           if(b[i]<b[i-1]){
               int temp = b[i];
               b[i] = b[i-1];
               b[i-1] = temp;
            }    
        }
    }
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array 1 : ");
        int n = sc.nextInt();
        System.out.println("Enter the Size of the Array 2 : ");
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        System.out.println("Enter the Elements of the Array 1 : ");
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Elements of the Array 2 : ");
        for(i=0;i<m;i++)
        {
            b[i] = sc.nextInt();
        }
        while(i<n)
        {
            int j=0;
          if(a[i]>b[j])
          {
            int temp = a[i];
            a[i] = b[j];
            b[j] = temp;
            SortArray(b);
          }
          i++;
        }
        System.out.println("After sorting : ");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
