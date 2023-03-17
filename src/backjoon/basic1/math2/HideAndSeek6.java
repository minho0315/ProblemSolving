package backjoon.basic1.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HideAndSeek6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);

        int[] d = new int[n];

        String[] a = br.readLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            d[i] = Math.abs(Integer.parseInt(a[i]) - s);
        }

        int result = d[0];
        for (int i = 1; i < d.length; i++) {
            result = gcd(d[i], result);
        }

        System.out.println(result);

    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
//17087 숨바꼭질 6