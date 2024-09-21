import java.util.*;

public class DFS {
    private List<List<Integer>> adjList;
    private boolean[] visited;

    public DFS(int V) {
        adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        visited = new boolean[V];
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
    }

    public void dfs(int start) {
        visited[start] = true;
        System.out.print(start + " ");

        for (int neighbor : adjList.get(start)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        DFS graph = new DFS(V);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("DFS traversal starting from vertex 0:");
        graph.dfs(0);
    }
}