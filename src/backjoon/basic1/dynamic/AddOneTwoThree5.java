package backjoon.basic1.dynamic;

import java.io.*;
import java.util.Arrays;

public class AddOneTwoThree5 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[][] dp = new int[100001][4];
//        dp[1][1] = 1;
//        dp[2][2] = 1;
//        dp[3][1] = 1;
//        dp[3][2] = 1;
//        dp[3][3] = 1;
//
//        for (int i = 4; i < 100001; i++) {
//            dp[i][1] = dp[i - 1][2] % 1000000009 + dp[i - 1][3] % 1000000009;
//            dp[i][2] = dp[i - 2][1] % 1000000009 + dp[i - 2][3] % 1000000009;
//            dp[i][3] = dp[i - 3][1] % 1000000009 + dp[i - 3][2] % 1000000009;
//        }
//
//        for (int i = 0; i < n; i++) {
//            int t = Integer.parseInt(br.readLine());
//            System.out.println(Arrays.stream(dp[t]).sum() % 1000000009);
//        }
//    }

    static final int MOD = 1000000009;
    static long[][] dp = new long[100001][4];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i = 4; i <= 100000; i++) {
            dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % MOD;
            dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % MOD;
            dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % MOD;
        }

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            long res = (dp[n][1] + dp[n][2] + dp[n][3]) % MOD;
            bw.write(res + "\n");
        }

        bw.flush();
    }
}
//15990 1,2,3 더하기 5