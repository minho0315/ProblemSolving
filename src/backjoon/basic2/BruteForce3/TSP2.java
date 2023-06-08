package backjoon.basic2.BruteForce3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TSP2 {

    static int n;
    static boolean[] visited;
    static int[][] map;
    static long result_min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[n];
        visited[0] = true;
        dfs(0, 0);
        System.out.println(result_min);
    }

    public static void dfs(int now, long cost) {
        if (allVisited()) {
            if (map[now][0] != 0) {
                result_min = Math.min(result_min, cost + map[now][0]);
            }
            return;
        }

        for (int i = 1; i < n; i++) {
            if (!visited[i] && map[now][i] != 0) {
                visited[i] = true;
                dfs(i, cost + map[now][i]);
                visited[i] = false;
            }
        }
    }

    public static boolean allVisited() {
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }
}
// 10971 외판원 순회 2
// https://velog.io/@yanghl98/%EB%B0%B1%EC%A4%80-10971-%EC%99%B8%ED%8C%90%EC%9B%90-%EC%88%9C%ED%9A%8C-2-JAVA