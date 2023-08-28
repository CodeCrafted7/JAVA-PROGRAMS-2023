import java.util.*;
public class p3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        int i,one=0,two=0,three=0,four=0;
        System.out.println("Enter the Elements of the Array : ");
        for(i=0;i<n;i++)
        {
            marks[i]= sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(marks[i]>=81 && marks[i]<=100)
                one++;
            else if(marks[i]>=61)
                two++;
            else if(marks[i]>=41)
                 three++;
            else 
                  four++;
        }
        System.out.print("Marks of the Student Are : ");
        for(i=0;i<n;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println("Number of Students in range 81-100 is/are " + one);
		System.out.println("Number of Students in range 61-80 is/are " + two);
		System.out.println("Number of Students in range 41-60 is/are " + three);
		System.out.println("Number of Students in range 00-41 is/are " + four);
        sc.close();

    }
}
