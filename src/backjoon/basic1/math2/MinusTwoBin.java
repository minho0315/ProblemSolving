package backjoon.basic1.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinusTwoBin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        while (n != 0) {
            int r = n % -2;
            n = n / -2;

            if (r == -1) {
                n += 1;
                r = 1;
            }
            sb.append(r);
        }

        System.out.println(sb.reverse());
    }
}
//2089 -2진수