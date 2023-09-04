import java.util.*;
public class ArrayRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements:");
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.print("Enter "+x+" Elements:");
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number of Rotation:");
        int r = sc.nextInt();
        for(int i=0;i<r;i++){
           int l=arr[0];
            for(int j=0;j<x-1;j++){
                arr[j]=arr[j+1];
            }
            arr[x-1]=l;
        }
        System.out.print("Array after Rotation: ");
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}