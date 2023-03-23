package backjoon.basic1.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeOne {
//    https://bio-info.tistory.com/159
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] d = new int[x + 1];

        for (int i = 2; i < x+1; i++) {
            d[i] = d[i-1] + 1;

            if (i % 2 == 0) {
                d[i] = Math.min(d[i], d[i/2] + 1);
            }

            if (i % 3 == 0) {
                d[i] = Math.min(d[i], d[i/3] + 1);
            }
        }

        System.out.println(d[x]);
    }
}
//1463 1로 만들기