package backjoon.basic2.BruteForce3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lotto {

    static int n;
    static int[] arr;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if (n == 0)
                break;

            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            visited = new int[n];
            dfs(0, 0);

            System.out.println();
        }
    }

    private static void dfs(int start, int depth) {
        if (depth == 6) {
            for (int i = 0; i < n; i++) {
                if(visited[i] == 1) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        for (int i = start; i < n; i++) {
            visited[i] = 1;
            dfs(i+1, depth+1);
            visited[i] = 0;
        }
    }
}
// 6603 로또
// https://sdesigner.tistory.com/56