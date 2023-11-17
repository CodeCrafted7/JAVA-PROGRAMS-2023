public class BipartiteGraph {    
    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;     
   int[] colors = new int[n];
        Arrays.fill(colors, -1);        
        for (int i = 0; i < n; i++) {      
      if (colors[i] == -1) {
                if (!bfs(i, graph, colors)) {          
          return false;          
      }            }        }
        return true;    }    
    public static boolean bfs(int node, int[][] graph, int[] colors) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);   
     colors[node] = 0;        
        while (!queue.isEmpty()) {    
        int curr = queue.poll();
            for (int neighbor : graph[curr]) {      
          if (colors[neighbor] == -1) {
                    colors[neighbor] = 1 - colors[curr];         
           queue.offer(neighbor);
                } else if (colors[neighbor] == colors[curr]) {                  
  return false;          
      }            }        }
        return true;    }    
    public static void main(String[] args) {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}}; 
        boolean isBipartite = isBipartite(graph);
        if (isBipartite) {       
     System.out.println("Yes Bipartite");
        } else {           
 System.out.println("Not Bipartite");    
    }    
}
}
