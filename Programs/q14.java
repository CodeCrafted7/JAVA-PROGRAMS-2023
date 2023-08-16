import java.util.*;

public class q14 {
  public static int[][] merge(int[][] intervals) {
            
            int[][] array = new int[10001][];
            int numIntervals = intervals.length;
            for (int[] interval : intervals) {
                int[] lastMerged = null;
                for (int i = interval[0]; i <= interval[1]; i++) {
                 if (array[i] != null) {
                     if (lastMerged != array[i]) {
                            numIntervals--;
                            lastMerged = array[i];
           if (array[i][0] < i) {
                     for (int j = array[i][0]; j < interval[0]; j++) {
                                    array[j] = interval;
                                }
                                interval[0] = array[i][0];
                            }
                            interval[1] = Math.max(interval[1], array[i][1]);
                        }
                    }
                    array[i] = interval;
                }
            int[][] results = new int[numIntervals][];
            int[] lastInterval = null;
            for (int i = 0, j = 0; j < numIntervals; i++) {
                if (array[i] != null && array[i] != lastInterval) {
                    lastInterval = array[i];
                    results[j++] = lastInterval;
                }
            }
    
            return results;
        }}

    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int intervals[][] = new int[10][10];
        System.out.println("Enter the elements : ");
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                intervals[i][j] = sc.nextInt();
            }
        }
        merge(intervals);
    }
}
