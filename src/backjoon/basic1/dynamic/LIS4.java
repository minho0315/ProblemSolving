package backjoon.basic1.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LIS4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int x = Arrays.stream(dp).max().getAsInt();
        System.out.println(x);

        List<Integer> result = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (dp[i] == x) {
                result.add(arr[i]);
                x--;
            }
        }
        Collections.reverse(result);
        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }
}
//14002 가장 긴 증가하는 부분 수열 4