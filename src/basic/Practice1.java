package basic;

import java.util.ArrayList;

public class Practice1 {
    public static ArrayList<String> path = new ArrayList<>();
    public static boolean[] visited;
    public static int[][] graphView = {
        {0, 1, 0, 0, 0},  // 0번 노드가 1번과 연결됨
        {1, 0, 0, 0, 1},  // 1번 노드가 0번, 4번과 연결됨
        {0, 0, 0, 1, 0},  // 2번 노드가 3번과 연결됨
        {0, 0, 1, 0, 0},  // 3번 노드가 2번과 연결됨
        {0, 1, 0, 0, 0}   // 4번 노드가 1번과 연결됨
    };
    public static int nodeNum;
    public Practice1(int nodeNum){
        this.nodeNum = nodeNum;
    }
    public static void addEdge(int i, int j){
        graphView[i][j] = 1;
    }
    public static void removeEdge(int i, int j) {
        graphView[i][j] = 0;
    }
    public static void viewGraph() {
        for (int i = 0; i < nodeNum; i++) {
            for (int j = 0; j < nodeNum; j++) {
                System.out.print(graphView[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void check(int[][] graph,int i, int j){
        if(graph[i][j]==1){
            System.out.println(i+"번 노드와" +j +"번 노드가 연결 되었습니다.");

        }
        else {
            System.out.println("연결된 노드가 없습니다.");
        }
    }
    public static void dfs(int node) {
        visited[node] = true;
        System.out.println(node + "번 노드를 방문했습니다.");
        for (int i = 0; i < nodeNum; i++) {
            if (graphView[node][i] == 1 && !visited[i]) {
                path.add(node + " -> " + i); // 연결 정보 저장
                dfs(i);
            }
        }
    }
    public static void checkLoop(int[][] graph,int node){
        for(int i = 0; i<graph[node].length;i++){
            if(graph[node][i]==1){
                System.out.println(node+"번 노드가 "+i+"번 노드와 연결 되었습니다.");
            }
        }
    }


    public static void main(String[] args){
        Practice1 graph = new Practice1(5);
        visited = new boolean[nodeNum];
        dfs(1);
        System.out.println("DFS 탐색 경로:");
        for (String step : path) {
            System.out.println(step);
        }
        graph.viewGraph();
    }




}
