package backjoon.basic1.dynamic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AscentNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[10];
        for (int i = 0; i < 10; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 10; j++) {
                dp[j] += dp[j - 1] % 10007;
            }
        }
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += dp[i];
        }
        System.out.println(sum % 10007);
    }
}
//11057 오르막수
// https://animoto1.tistory.com/entry/%EB%B0%B1%EC%A4%80-11057-%EC%98%A4%EB%A5%B4%EB%A7%89-%EC%88%98-%ED%8C%8C%EC%9D%B4%EC%8D%AC-Python