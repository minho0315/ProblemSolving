package backjoon.basic1.dynamic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ContinuousSum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int[][] dp = new int[2][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = arr[i];
            dp[1][i] = arr[i];
        }

        for (int i = 1; i < n; i++) {
            dp[0][i] = Math.max(dp[0][i], dp[0][i-1] + arr[i]);
            dp[1][i] = Math.max(dp[0][i-1], dp[1][i-1] + arr[i]);
        }

        int max0 = Arrays.stream(dp[0]).max().getAsInt();
        int max1 = Arrays.stream(dp[1]).max().getAsInt();
        System.out.println(Math.max(max0, max1));
    }
}
//13398 연속합2
//https://ji-gwang.tistory.com/289