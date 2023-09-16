import java.util.*;
public class q64 {
    public static int lps(String s) {
        int n=s.length();
        int[]lps=new int[n];
        int len=0;
        int i=1;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            } else {
                if(len !=0){
                    len=lps[len-1];
                } else {
                    lps[i]=0;
                    i++;
                }
            }
            }
            System.out.println(lps[n-1]);
            return lps[n-1];
        }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String : ");
            String a = sc.next();
            lps(a);
        }
}
