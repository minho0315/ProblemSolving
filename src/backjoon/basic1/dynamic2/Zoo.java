package backjoon.basic1.dynamic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 3;
        for (int i = 2; i < n+1; i++) {
            dp[i] = (dp[i-2] + dp[i-1]*2)%9901;
        }
        System.out.println(dp[n]);
    }
}
//1309 동물원
//https://my-coding-notes.tistory.com/264