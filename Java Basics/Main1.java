import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt(); 
          int[] arr = new int[n];
            for (int i = 0; i < n; i++)   
           arr[i] = sc.nextInt();        
            int key = sc.nextInt();
            Arrays.sort(arr); 
            int left = 0, right = n - 1;        
            boolean found = false;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == key) {
                    System.out.println(arr[left] + " " + arr[right]);
                    found = true;           
                   break;
                } else if (sum < key) {        
                left++;
                } else {         
           right--;       
       }            }
            if (!found) {                System.out.println("No Such Elements Exist");            }        }
        sc.close();    }}

