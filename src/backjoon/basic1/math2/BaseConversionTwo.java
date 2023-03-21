package backjoon.basic1.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseConversionTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int temp = n % b;

            if (temp > 9) {
                sb.append((char) (temp + 55));
            } else {
                sb.append(temp);
            }
            n = n / b;
        }

        System.out.println(sb.reverse());
    }
}
//11005 진법 변환 2