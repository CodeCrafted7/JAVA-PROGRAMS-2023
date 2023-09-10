import java.util.*;
public class q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ënter the String : ");
        String str = sc.next();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println("Duplicate Element Present : ");
                break;
            }
            else
            System.out.println("Duplicate Element not Present :");
        }




    }
}
