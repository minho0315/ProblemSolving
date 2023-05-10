package backjoon.basic2.BruteForce1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KayingCalendar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int M = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);
            int x = Integer.parseInt(input[2]);
            int y = Integer.parseInt(input[3]);

            System.out.println(calc(M, N, x, y));
        }
    }

    private static int calc(int m, int n, int x, int y) {
        while (x <= m * n) {
            if ((x - y) % n == 0) {
                return x;
            }
            x += m;
        }
        return -1;
    }
}
