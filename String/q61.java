
import java.util.*;
public class q61 {
   public  static boolean ispar(String x)
    {
        Stack<Character> s=new Stack<>();
        int l=x.length();
        for(int i=0;i<l;i++){
            char c=x.charAt(i);
            if(c=='{'||c=='['||c=='('){
                s.push(c);
                continue;
            }
            if(s.isEmpty()) return false;
            char check;
            switch(c){
                case '}':
                    check=s.pop();
                    if(check=='['||check=='(')
                    return false;
                break;
                case ')':
                    check=s.pop();
                    if(check=='{'||check=='[')
                    return false;
                break;
                case ']':
                    check=s.pop();
                    if(check=='{'||check=='(')
                    return false;
                break;
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        boolean flag = ispar(a);
        System.out.println(flag);
    }
}
