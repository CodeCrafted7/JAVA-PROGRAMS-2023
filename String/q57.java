import java.util.*;

public class q57 {
    public static int split(String s) {
        int n = s.length();
        int x = 0, y = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                x++;
            } else
                y++;

            if (x == y)
                c++;

        }
        if (x != y)
            return -1;

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        int res = split(str);
        System.out.println("Split String in 0 and 1 : " + res);
    }
}
