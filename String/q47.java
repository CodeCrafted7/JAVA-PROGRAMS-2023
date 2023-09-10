import java.util.*;
public class q47 {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        char arr[] =str.toCharArray();
        int j = arr.length-1;
        char temp;
        for(i=0;i<str.length()/2;i++)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        System.out.println("After Reverse : ");
        for(i=0;i<str.length();i++)
        {
            System.out.print(arr[i]);
        }
    }
}
