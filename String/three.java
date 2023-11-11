import java.util.*;
public class three {
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int i,n,one=0,two=0,three=0,four=0;
      System.out.print("Enter the Size of the Array : ");
      n= sc.nextInt();
      int marks[]= new int[n];
      System.out.println("Enter the Element in the Array : ");
      for(i=0;i<n;i++)
      {
        marks[i] = sc.nextInt();
      }
        for( i=0; i<n; i++)
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
        System.out.print("Marks of Students: ");
        for( i=0;i<n;i++)
        {
        System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println("Student in the range of 81-100 :- "+one);
        System.out.println("Student in the range of 61-80 :- "+two);
        System.out.println("Student in the range of 41-60 :- "+three);
        System.out.println("Student in the range of 0-40 :- "+four);
    }
}
