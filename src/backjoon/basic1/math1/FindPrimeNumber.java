package backjoon.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int result = 0;

        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            int error = 0;
            if (num <= 1) {
                continue;
            }

            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    error++;
                }
            }

            if (error == 0) {
                result++;
            }
        }

        System.out.println(result);
    }
}
//1978 소수 찾기
