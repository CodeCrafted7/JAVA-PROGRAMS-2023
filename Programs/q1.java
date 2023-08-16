import java.util.*;
public class q1
{
    public static void main(String[] args) {
        int n,i,start=0,end,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        n = sc.nextInt();
        System.out.print("Enter the Element of the Array : ");
        int arr[] = new int[n];
        end = n-1;
        for(i=0;i<n;i++)
        {
          arr[i] = sc.nextInt();
        }
        System.out.print("Array before Reverse :-  ");
       for(i=0;i<n;i++)
        {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
       while(start<end)
       {
         temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
       }
       System.out.print("Array after Reverse :-  ");
       for(i=0;i<n;i++)
        {
          System.out.print(arr[i] + " ");
        }


    }
}