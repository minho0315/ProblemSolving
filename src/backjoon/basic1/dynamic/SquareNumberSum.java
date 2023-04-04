package backjoon.basic1.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareNumberSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = i;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < i; j++) {
                if (j*j > i) {
                    break;
                }

                int temp = dp[i - j * j] + 1;
                if (dp[i] > temp) {
                    dp[i] = temp;
                }
            }
        }

        System.out.println(dp[n]);
    }
}
//1699 제곱수의 합