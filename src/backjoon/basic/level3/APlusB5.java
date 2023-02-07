package backjoon.basic.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APlusB5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] input = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(a+b);
        }
    }
}
//10952 A+B - 5
