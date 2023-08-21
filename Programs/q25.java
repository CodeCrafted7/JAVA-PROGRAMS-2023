import java.util.*;
public class q25 {
    public static void appearmtnk(int arr[],int n,int k )
    {
        int x  =n/k;
       HashMap<Integer,Integer> map = new HashMap<>();
       int c=0;
       for (int i = 0; i < n; i++)
       {
        map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
       }
       for(Map.Entry<Integer,Integer> entry : map.entrySet())
       {
        if(entry.getValue()>x)
         c++;
       }
       System.out.println(n/k+" Appears in "+c+" time :)");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the Value of K : ");
        int k  = sc.nextInt();
            appearmtnk(arr,n,k);

    }
}
