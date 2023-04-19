package backjoon.basic1.datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WineTasting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] wines = new int[n];
        for(int i = 0; i < n; i++) {
            wines[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            System.out.println(wines[0]);
            return;
        }
        if (n == 2) {
            System.out.println(wines[0] + wines[1]);
            return;
        }

        int[] dp = new int[n];
        dp[0] = wines[0];
        dp[1] = wines[0] + wines[1];
        dp[2] = Math.max(Math.max(wines[2] + wines[0], wines[2] + wines[1]), dp[1]);
        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(Math.max(wines[i] + dp[i-2], wines[i] + wines[i-1] + dp[i-3]), dp[i-1]);
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());

    }
}
//https://velog.io/@bye9/%EB%B0%B1%EC%A4%80%ED%8C%8C%EC%9D%B4%EC%8D%AC-2156-%ED%8F%AC%EB%8F%84%EC%A3%BC-%EC%8B%9C%EC%8B%9D
//2156 포도주 시식