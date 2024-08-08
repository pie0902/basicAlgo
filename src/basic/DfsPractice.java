package basic;

public class DfsPractice {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1, 0}, // 노드 1의 인접 노드
            {1, 0, 0, 1}, // 노드 2의 인접 노드
            {1, 0, 0, 1}, // 노드 3의 인접 노드
            {0, 1, 1, 0}  // 노드 4의 인접 노드
        };
        boolean[] visited = new boolean[graph.length];
        dfs(graph,0,visited);
    }
    public static void dfs(int[][] graph,int node,boolean[] visited) {
        visited[node] = true;
        System.out.println("visited node: " + (node+1));

        for(int i = 0; i<graph.length;i++){
            if(graph[node][i]==1&&!visited[i]){
               dfs(graph,i,visited);
            }
        }

    }
}
