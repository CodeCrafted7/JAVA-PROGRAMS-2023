import java.util.*;
public class q34 {
    public static void palindromeopeartion(int arr[],int n)
    { 
        int i=0;
        int j=n-1;
        int ans = 0;
        while(i<j)
        {
            if(arr[i]==arr[j]){
            i++;
            j--;
            }
            else if (arr[i]>arr[j])
            {
                i++;
                arr[i]+=arr[i-1];
                ans++;
            }
            else{
            j--;
            arr[j]+=arr[j+1];
            ans++;
            }
        }
        System.out.println("Minimum Number of operation Required is : "+ans);

    }
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the Array : ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
            palindromeopeartion(arr,n);
}
}
