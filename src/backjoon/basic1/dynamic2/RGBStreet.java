package backjoon.basic1.dynamic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RGBStreet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n][3];
        for (int i = 0; i < dp.length; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                dp[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + dp[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + dp[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + dp[i][2];
        }

        int result = Math.min(dp[n-1][0], dp[n-1][1]);
        result = Math.min(result, dp[n-1][2]);

        System.out.println(result);
    }
}
//1149 RGB거리
//https://pacific-ocean.tistory.com/147