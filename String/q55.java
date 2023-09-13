import java.util.*;
public class q55 {
    public static void AllSequence(String t,int i,int n,String s)
    {
        if(i==n)
        {
            System.out.println(t);
        }
        else
        {
            AllSequence(t,i+1,n,s);
            t=t+s.charAt(i);
            AllSequence(t, i+1, n, s);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        AllSequence("",0,str.length(),str); 
    }
}
