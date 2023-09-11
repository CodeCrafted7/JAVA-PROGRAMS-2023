import java.util.*;
public class q52 {
    public static String countandsay(int n )
    {
        if(n==1)
          return "1";
        String s = countandsay(n-1);
        StringBuilder  res = new StringBuilder();
        int counter=0;
        for(int i=0;i<s.length();i++)
        {
            counter++;
            if(i==s.length()-1 || s.charAt(i) != s.charAt(i+1))
            {
                res.append(counter).append(s.charAt(i));
                counter=0;
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        String res = countandsay(n);
        System.out.println("Count and Say is : "+res);
    }
}
