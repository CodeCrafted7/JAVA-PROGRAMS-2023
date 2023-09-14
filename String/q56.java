import java.util.*;

public class q56 {
    public static String swap(String s, int a, int b) {
        char ch[] = s.toCharArray();
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
        return String.valueOf(ch);
    }

    public static void Permute(int index, String s) {
        if (index == s.length() - 1) {
            System.out.println(s);
            return;
        }
        for (int i = index; i < s.length(); i++) {
            s = swap(s, i, index);
            Permute(index + 1, s);
            s = swap(s, i, index);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        System.out.println("String All Permutation are : ");
        Permute(0, str);
    }
}
