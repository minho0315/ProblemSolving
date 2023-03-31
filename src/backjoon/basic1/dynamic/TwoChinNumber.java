package backjoon.basic1.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoChinNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n + 1];

        if (n == 1) {
            System.out.println(1);
        } else {
            dp[1] = 1;
            dp[2] = 1;
            for (int i = 3; i < n+1; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }

            System.out.println(dp[n]);
        }
    }
}
//2193 이친수