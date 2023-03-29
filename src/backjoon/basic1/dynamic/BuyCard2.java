package backjoon.basic1.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyCard2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ps = new int[n+1];
        String[] input = br.readLine().split(" ");
        for (int i = 1; i < n+1; i++) {
            ps[i] = Integer.parseInt(input[i-1]);
        }
        int[] dp = new int[n+1];

        for (int i = 1; i < n + 1; i++) {
            for (int k = 1; k < i + 1; k++) {
                int temp = dp[i - k] + ps[k];
                if (dp[i] == 0) {
                    dp[i] = temp;
                } else {
                    dp[i] = Math.min(dp[i], temp);
                }
            }
        }

        System.out.println(dp[n]);
    }
}
//16194 카드 구매하기2
//https://infinitt.tistory.com/251