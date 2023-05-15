package backjoon.basic2.BruteForce2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NAndM2 {

    private static int[] arr;
    private static int N, M;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(1, 0);
        System.out.println(sb);
    }

    private static void dfs(int at, int depth) {

        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = at; i <= N; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}
//15650 N과 M (2)
//https://st-lab.tistory.com/115