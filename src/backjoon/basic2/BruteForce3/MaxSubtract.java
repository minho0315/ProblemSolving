package backjoon.basic2.BruteForce3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSubtract {

    private static int[] arr;
    private static int[] temp;
    private static boolean[] visited;
    private static int result;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        temp = new int[n];
        visited = new boolean[n];

        dfs(0);
        System.out.println(result);
    }

    private static void dfs(int depth) {
        if (depth == n) {
            result = Math.max(getResult(), result);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp[depth] = arr[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }

    private static int getResult(){
        int sum = 0;
        for(int i = 0; i< n - 1; i++){
            sum += Math.abs(temp[i] - temp[i+1]);
        }
        return sum;
    }
}
//10819 차이를 최대로
//https://velog.io/@yanghl98/%EB%B0%B1%EC%A4%80-10819-%EC%B0%A8%EC%9D%B4%EB%A5%BC-%EC%B5%9C%EB%8C%80%EB%A1%9C