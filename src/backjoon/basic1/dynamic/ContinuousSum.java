package backjoon.basic1.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ContinuousSum {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        int[] dp = new int[n];
//        String[] input = br.readLine().split(" ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(input[i]);
//        }
//
//        dp[0] = arr[0];
//        int max = arr[0];
//
//        for (int i = 1; i < n; i++) {
//            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
//            max = Math.max(max, dp[i]);
//        }
//
//        System.out.println(max);
//
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        dp[0] = arr[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());

    }
}
//https://zoonvivor.tistory.com/152
//1912 연속합