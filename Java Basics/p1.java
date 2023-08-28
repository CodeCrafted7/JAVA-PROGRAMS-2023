import java.util.*;
public class p1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A and B : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Press 1 for Addtion\n Press 2 for Subtraction\n Press 3 for Multiplication\n Press 4 for Division\n Press 5 for Modulus\n ");
        System.out.println("Enter the Operation : ");
        int opt = sc.nextInt();
        switch(opt)
        {
            case 1 : 
                int add =a+b;
                System.out.println("Addtion of two Number is : "+add);
                break;
            case 2 :
                int sub = a-b;
                System.out.println("Subtraction of two Number is : "+sub);
                break;
            case 3 : 
               int mul = a*b;
               System.out.println("Multiplication of two Number is : "+mul);
               break;
            case 4 :
               int div = a/b;
               System.out.println("Division of two Number is : "+div);
               break;
            case 5 :
                 int mod = a%b;
                 System.out.println("Modulus of two Number is : "+mod);
                break;
            default :
            System.out.println("Wrong input ");
            break;
        }
        sc.close();
    }
    
}
