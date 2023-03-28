package backjoon.basic1.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyCard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] ps = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            ps[i+1] = Integer.parseInt(input[i]);
        }

        for (int i = 1; i < n+1; i++) {
            for (int k = 1; k < i+1; k++) {
                dp[i] = Math.max(dp[i], dp[i-k] + ps[k]);
            }
        }

        System.out.println(dp[n]);
    }
}
//11052 카드 구매하기
//https://infinitt.tistory.com/250
