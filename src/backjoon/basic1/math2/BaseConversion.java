package backjoon.basic1.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int b = Integer.parseInt(input[1]);
        int result = Integer.parseInt(input[0], b);

        System.out.println(result);
    }
}
//2745 진법 변환