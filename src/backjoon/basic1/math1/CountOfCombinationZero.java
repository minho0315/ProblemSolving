package backjoon.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfCombinationZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int fiveNumber = countNumber(n, 5) - countNumber(m, 5) - countNumber(n - m, 5);
        int twoNumber = countNumber(n, 2) - countNumber(m, 2) - countNumber(n - m, 2);

        System.out.println(Math.min(fiveNumber, twoNumber));
    }

    private static int countNumber(int a, int k) {
        int count = 0;
        while (a > 0) {
            count += a / k;
            a /= k;
        }
        return count;
    }
}
//2004 조합 0의 개수