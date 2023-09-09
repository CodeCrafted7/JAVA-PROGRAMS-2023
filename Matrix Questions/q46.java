import java.util.*;
public class q46 {
    public static void FindCommonEle(int arr[][],int r,int c )
    {
        int i,j;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(i=0;i<c;i++)
        {
            map.put(arr[0][i],1);
        }
        for(i=1;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(map.containsKey(arr[i][j]) && map.get(arr[i][j])==i )
                {
                   map.put(arr[i][j],map.get(arr[i][j])+1);
                }
                if(i == r-1 && map.containsKey(arr[i][j]) && map.get(arr[i][j])==r )
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of Row and Column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the Elements of the Matrix : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr[i][j]  = sc.nextInt();
            }
        }
        System.out.println("Common Eleement is : ");
        FindCommonEle(arr,r,c);
    }
}
