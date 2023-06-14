package backjoon.basic2.BruteForce4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddOneTwoThree {

    private static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            rec(0, n);
            System.out.println(answer);
            answer = 0;
        }
    }

    private static void rec(int sum, int goal) {
        if (sum > goal) {
            return;
        }

        if (sum == goal) {
            answer += 1;
            return;
        }

        for (int i = 1; i < 4; i++) {
            rec(sum + i, goal);
        }
    }
}
// 9095 1, 2, 3 더하기 (재귀)
// https://enhjh.tistory.com/57