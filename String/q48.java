import java.util.*;
public class q48 {
      public static int isPalindrome(String S) {
        
            int left=0,right=S.length()-1;
            while(left<right){
                if(S.charAt(left)!=S.charAt(right)){
                    return 0;
                }
                left++;
                right--;
            }
             return 1;
        }
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
    
        int check = isPalindrome(str);
        if(check==1)
        System.out.println("String is Palindrome ");
        else
        System.out.println("String is Not Palindrome ");
    }
}
