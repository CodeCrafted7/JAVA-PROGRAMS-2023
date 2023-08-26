import java.util.*;
public class q38 {


  public static boolean searchMatrix(int[][] matrix, int target) 
  {

    int rowIdx = sPRow(matrix, target);
    if (rowIdx != -1)
      return bsRow(rowIdx, matrix, target);
    return false;
  }

  private  static int sPRow(int[][] matrix, int target) {
    int low = 0;
    int high = matrix.length - 1;
    int idx = matrix[0].length - 1;
    while (low <= high) {
      int mid = low + (high - low)/2;

      if (matrix[mid][0] <= target && target <= matrix[mid][idx]) {
        return mid;
      }
      else if (matrix[mid][0] < target) low = mid + 1;
      else if (matrix[mid][0] > target) high = mid - 1;
    }
    return -1;
  }

  private  static boolean bsRow(int rowIdx, int[][] matrix, int target) {
    int low = 0;
    int high = matrix[rowIdx].length - 1;
    while (low <= high) {
      int mid = low + (high - low)/2;

      if (matrix[rowIdx][mid] == target) {
        return true;
      }
      else if (matrix[rowIdx][mid] > target) high = mid - 1;
      else low = mid + 1;
    }
    return false;
  }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Matrix : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int i = 0, j = 0;
        System.out.println("Enter the Elements of the Matrix : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Element to Search : ");
        int t = sc.nextInt();
        boolean ans = searchMatrix(arr,t);
       if(ans == true)
         System.out.println("Element Present ");
         else
           System.out.println("Element Not Present ");      
    }
}
