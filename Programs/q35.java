import java.util.*;
public class q35 {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array 1 : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element of the Array : ");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int j = 0;
        System.out.println("Enter the size of the Array 2 : ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter the element of the Array : ");
        for (j = 0; j < m; j++)
            b[j] = sc.nextInt();


        int count;
        int m1=0;
        int m2=0;
        for(count=0;count<=n;count++)
        {
             if(i==n)
          {
            m1=m2;
            m2=b[0];
            break;
          }
          else if(j==m)
          {
            m1=m2;
            m2=a[0];
            break;
          }

          if(a[i]<b[j])
          {
            m1=m2;
            m2=a[i];
            i++;
          }
          else
          {
            m1=m2;
            m2=b[j];
            j++;
          }
        }
        int ans =(m1+m2)/2;
        System.out.println("Median of the Array is : "+ans);
    }
}
