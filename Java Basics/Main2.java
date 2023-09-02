import java.util.*;
public class Main2 {
    public static boolean hasCycle(ArrayList<Integer>[] adj, int n) {
        int[] inDegree = new int[n];
        for (int i = 0; i < n; i++) {     
       for (int v : adj[i]) {
                inDegree[v]++;       
     }        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {       
     if (inDegree[i] == 0) {          
      q.add(i);            }        }
        int count = 0;      
  while (!q.isEmpty()) {          
  int u = q.poll();      
      count++;
            for (int v : adj[u]) {         
       if (--inDegree[v] == 0) {             
      q.add(v);             
   }       }       }
        return count != n; 
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");   
   int n = sc.nextInt();
        System.out.print("Enter the number of edges: ");  
      int e = sc.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {        
    adj[i] = new ArrayList<>();       
 }
        System.out.println("Enter the edges: ");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();  
          int v = sc.nextInt();
            adj[u].add(v);   
     }
        if (hasCycle(adj, n)) {        
    System.out.println("Yes Cycle Exists");
        } else {      
      System.out.println("No Cycle Exists");  
   }    } }

