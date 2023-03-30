package backjoon.basic1.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://cotak.tistory.com/12
public class EasySteps {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n+1][10];
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i < n+1; i++) {
            for (int k = 0; k < 10; k++) {
                if (k == 0) {
                    dp[i][k] = dp[i-1][1] % 1000000000;
                } else if (k == 9) {
                    dp[i][k] = dp[i-1][8] % 1000000000;
                } else {
                    dp[i][k] = (dp[i-1][k-1] + dp[i-1][k+1]) % 1000000000;
                }
            }
        }

        long answer = 0;
        for (int i = 0; i < 10; i++) {
            answer += dp[n][i];
        }

        System.out.println(answer % 1000000000);
    }
}
//10844 쉬운 계단의 수