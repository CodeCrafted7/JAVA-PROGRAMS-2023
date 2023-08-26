import java.util.*;
public class q37 {
    public static ArrayList<Integer> spiralmatrix(int matrix[][],int n)
    {
        int i;
        ArrayList<Integer> ans = new ArrayList<>();
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                ans.add(matrix[startRow][j]);
            }
            //right
            for(i=startRow+1;i<=endRow;i++){
                ans.add(matrix[i][endCol]);
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                ans.add(matrix[endRow][j]);
            }
            //left
            for( i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                ans.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println("After spiral Traversal : ");
         for(i=0;i<ans.size();i++)
         {
            System.out.print(ans.get(i));
         }
        return ans;
        
         
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Size of the Matrix : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int i=0,j=0;
        System.out.println("Enter the Elements of the Matrix : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        spiralmatrix(arr,n);
    }
}

