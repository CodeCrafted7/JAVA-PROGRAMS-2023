import java.util.*;
public class q53 {
    static int expandFromMiddle(String str,int left ,int right)
    {
        if(str == null || left > right)
        {
            return 0;
        }
        
        
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right))
        {
            left--;
            right++;
        }
        
        return right - left -1;
    }
    static String longestPalin(String S){
     
        if(S == null || S.length() < 2)
        {
            return S;
        }
        
        
        int start = 0;
        int end = 0;
        int maxLength = 0;
        for(int i = 0; i<S.length(); i++)
        {
            int len1 = expandFromMiddle(S,i,i);
            int len2 = expandFromMiddle(S,i,i+1);
             if (len1 > maxLength) {
                maxLength = len1;
                start = i - len1 / 2;
            }
            
             if (len2 > maxLength) {
                maxLength = len2;
                start = i - len2 / 2+1;
            }
            
          
        }
        
       
            
            
        return S.substring(start, start+maxLength);

        
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.next();
    String res = longestPalin(s);
    System.out.println("Longest Palindrome is : "+res);
}  
}
