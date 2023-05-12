package backjoon.basic2.BruteForce2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NAndM1 {
    private static int n, m;
    private static int[] arr;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        arr = new int[m];
        visited = new boolean[n+1];
        permutation(0);
    }

    private static void permutation(int cnt) {
        if (cnt == m) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[cnt] = i;
                permutation(cnt + 1);
                visited[i] = false;
            }
        }
    }
}
//15649 N과 M (1)
//https://velog.io/@yul_00/AlgorithmJava-%EC%88%9C%EC%97%B4%EA%B3%BC-%EC%A1%B0%ED%95%A9