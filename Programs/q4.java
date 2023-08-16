import java.util.*;


public class q4 {
    public static void sort(int arr[],int n)
    {
        int l=0,mid=0,temp,i;
        int high=arr.length-1;
        while(mid<=high)
        {
            switch(arr[mid])
            {
                case 0:{
                    temp = arr[l];
                    arr[l] = arr[mid];
                    arr[mid] = temp; 
                    l++;mid++;
                    break;
                }
                case 1 : 
                     mid++;
                     break;
                case 2:
                {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
        System.out.println("After Sorting : ");
         for(i=0;i<n;i++)
        {
          System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for(i=0;i<n;i++)
        {
          arr[i] = sc.nextInt();
        }
        sort(arr,n);
    }
    
}
