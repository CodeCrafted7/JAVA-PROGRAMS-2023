import java.util.*;
public class q22 {
    public static void fact(int n){
        int i;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int carry = 0;
        for( i = 2 ; i <= n ; i++){
            for(int j = list.size() - 1; j >= 0 ; j--){
                int product = (list.get(j) * i) + carry;
                list.set(j,product % 10);
                carry = product / 10;
            }
            while(carry != 0){
                list.add(0 , carry % 10);
                carry /= 10;
            }
        }
        System.out.println("Factorial of a Number "+n+" is : ");
        for(i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));
        }
      //  return list;
    }

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n= sc.nextInt();
        fact(n);
    }
}
