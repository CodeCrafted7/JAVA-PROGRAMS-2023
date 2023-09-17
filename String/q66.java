import java.util.*;
public class q66 {
    public static int Bracket(String s)
    {
        int open=0,close=0,rev=0;
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='{')
        open++;
        else
        {
            if(open==0) close++;
            else open--;
        }
       }
       rev = (int)(Math.ceil(open/2.0)+Math.ceil(close/2.0));
       return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.next();
        int res = Bracket(s);
        System.out.println("No of Reverse Braked Required is : "+res);

    }
}
