import java.util.*;

public class q62 {
    public static int wordBreak(String A, ArrayList<String> B) {
        // code here
        int dp[] = new int[A.length()];
        int t = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <= i; j++) {
                String check = A.substring(j, i + 1);
                if (B.contains(check)) {
                    if (j > 0) {
                        dp[i] += dp[j - 1];
                    } else {
                        dp[i] += 1;
                    }
                }
            }
        }
        return dp[A.length() - 1] > 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        int n = 10;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> memory = new ArrayList<String>();
        System.out.println("Enter the String : ");
        String a = sc.next();
        System.out.println("Enter the Dictionary String : ");
        int i = 0;
        while (i != n) {
            memory.add(sc.nextLine());
            System.out.println(memory.toString());
            i++;
        }
        int x = wordBreak(a, memory);
        System.out.println("Result is : " + x);
    }
}
