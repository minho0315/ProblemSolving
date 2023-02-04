package backjoon.basic.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeDies {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int reward = 0;

        if (a == b && b == c) {
            reward = 10000 + a * 1000;
        } else if (a == b || a == c) {
            reward = 1000 + a * 100;
        } else if (b == c) {
            reward = 1000 + b * 100;
        } else {
            if (a >= b && a >= c) {
                reward = a * 100;
            } else if (b >= a && b >= c) {
                reward = b * 100;
            } else {
                reward = c * 100;
            }
        }

        System.out.println(reward);
    }
}
