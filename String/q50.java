import java.util.*;

public class q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String S1 : ");
        String s1 = sc.next();
        System.out.println("Enter the String S2 : ");
        String s2 = sc.next();
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 != l2)
            System.out.println("LenGth not same :) ");
        String temp = s1 + s2;
        if (temp.contains(s2))
            System.out.println("One String is Rotation of Other");
        else
            System.out.println("No Rotation ");

    }
}
