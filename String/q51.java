

import java.util.*;
public class q51 {
    public static void main(String[] args) {
        int i=0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.next();
        System.out.println("Enter the Indices of the String : ");
        int n = sc.nextInt();
        int Indices[] = new int[n];
        for( i=0;i<n;i++)
        {
            Indices[i] = sc.nextInt();
        }
        char arr[] = new char[s.length()];
        for( i = 0;i<s.length();i++)
        {
            arr[Indices[i]]  = s.charAt(i);
        }
        String temp = String.valueOf(arr);
        System.out.println("String is : "+temp);
    }
}
