import java.util.Stack;

public class q42 {
    public int maxArea(int[][] matrix, int rows, int cols) {
        int ans = 0;
        int[] histo = new int[cols];
        
        for(int i = 0;i < rows;i++) {
            for(int j = 0;j < cols;j++) {
                if(matrix[i][j] == 0) {
                    histo[j] = 0;
                } else {
                    histo[j]++;
                }
            }
            
            ans = Math.max(ans, getMaxArea(histo, cols));
        }
        
        return ans;
    }
    
    public static int getMaxArea(int graph[], int n)  {
        int[] nextsmaller = giveNextSmaller(graph);
        int[] prevsmaller = givePreviousSmaller(graph);
        
        int ans = 0;
        
        for(int i = 0;i < n;i++) {
            ans = Math.max(ans, (nextsmaller[i] - prevsmaller[i] - 1) * graph[i]);
        }
        
        return ans;
    }
        
    public static int[] giveNextSmaller(int[] graph) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[graph.length];
        
        for(int i = graph.length - 1; i > -1;i--) {
            if(stack.isEmpty()) {
                stack.push(i);
                ans[i] = graph.length;
            } else {
                while(!stack.isEmpty() && graph[stack.peek()] >= graph[i]) {
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    ans[i] = graph.length;
                } else {
                    ans[i] = stack.peek();
                }
                stack.push(i);
            }
        }
        
        return ans;
    }
    
    public static int[] givePreviousSmaller(int[] graph) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[graph.length];
        
        for(int i = 0; i < graph.length;i++) {
            if(stack.isEmpty()) {
                stack.push(i);
                ans[i] = -1;
            } else {
                while(!stack.isEmpty() && graph[stack.peek()] >= graph[i]) {
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = stack.peek();
                }
                stack.push(i);
            }
        }
        
        return ans;
    }

}
