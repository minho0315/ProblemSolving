package backjoon.concept;

import java.util.Stack;

public class DFS {

    static boolean[] visited = new boolean[9];
    static int[][] graph = {{}, {2, 3, 8}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};

    public static void main(String[] args) {
        dfs(1);
    }

    // 재귀(Recursion)
    static void dfs(int nodeIndex) {
        visited[nodeIndex] = true;
        System.out.print(nodeIndex + " -> ");
        for (int node : graph[nodeIndex]) {
            if (!visited[node]) {
                dfs(node);
            }
        }
    }

//    //stack
//    static boolean[] visited = new boolean[9];
//    static int[][] graph = {{}, {2, 3, 8}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};
//    static Stack<Integer> stack = new Stack<>();
//
//    public static void main(String[] args) {
//        stack.push(1);
//        visited[1] = true;
//
//        while(!stack.isEmpty()) {
//            int nodeIndex = stack.pop();
//            System.out.print(nodeIndex + " -> ");
//
//            for (int linkedNode : graph[nodeIndex]) {
//                if (!visited[linkedNode]) {
//                    stack.push(linkedNode);
//                    visited[linkedNode] = true;
//                }
//            }
//        }
//    }
}

// https://codingnojam.tistory.com/44