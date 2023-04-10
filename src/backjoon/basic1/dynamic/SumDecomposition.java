package backjoon.basic1.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumDecomposition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int[][] dp = new int[201][201];
        for (int i = 0; i < 201; i++) {
            dp[1][i] = 1;
            dp[2][i] = i+1;
        }

        for (int i = 2; i < 201; i++) {
            dp[i][1] = i;
            for (int j = 2; j < 201; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000000;
            }
        }

        System.out.println(dp[k][n]);
    }
}
//https://it-garden.tistory.com/341
//2225 합분해