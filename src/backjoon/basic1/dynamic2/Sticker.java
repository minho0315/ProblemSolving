package backjoon.basic1.dynamic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sticker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] m1 = new int[n];
            int[] m2 = new int[n];
            String[] input1 = br.readLine().split(" ");
            String[] input2 = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                m1[j] = Integer.parseInt(input1[j]);
            }
            for (int j = 0; j < n; j++) {
                m2[j] = Integer.parseInt(input2[j]);
            }


            for (int j = 1; j < n; j++) {
                if (j == 1) {
                    m1[j] += m2[0];
                    m2[j] += m1[0];
                } else {
                    m1[j] += Math.max(m2[j-2], m2[j-1]);
                    m2[j] += Math.max(m1[j-2], m1[j-1]);
                }
            }

            System.out.println(Math.max(m1[n-1], m2[n-1]));
        }
    }
}
//9465 스티커
//https://fre2-dom.tistory.com/281