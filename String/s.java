import java.util.*;
public class s 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the value of A and B : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Press 1 for Addition \nPress 2 for Subtraction  \nPress 3 for Multiplication  \nPress 4 for Division  \nPress 5 for Modulus ");
        System.out.println("Enter the operation : ");
        int opt = sc.nextInt();
        switch(opt)
        {
            case 1 :
                  int add = a+b;
                  System.out.println("Additon of two Number is = "+add);
                  break;
            case 2 :
                  int sub = a-b;
                  System.out.println("Subtraction  of two Number is = "+sub);
                  break;
            case 3 :
                  int mul = a*b;
                  System.out.println("Multiplication  of two Number is = "+mul);
                  break;
            case 4 :
                  int div = a/b;
                  System.out.println("Division of two Number is = "+div);
                  break;
            case 5 :
                  int mod = a%b;
                  System.out.println("Modolus of two Number is = "+mod);
                  break;
            default :
                  System.out.println("Enter wrong Choice :)");
                  break;

        }
        sc.close();
    }
}