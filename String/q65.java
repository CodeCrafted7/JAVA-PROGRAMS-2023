import java.util.*;

public class q65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.next();
        String str[] = { "2", "22", "222", "3", "33", "333",
        "4", "44", "444", "5", "55", "555",
        "6", "66", "666", "7", "77", "777",
        "7777", "8", "88", "888", "9", "99",
        "999", "9999" };
        
        String op ="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                op += "0";
            else
                op += str[s.charAt(i) - 'A'];
        }

        System.out.println("Number is : "+op);
    }
}
