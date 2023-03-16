package backjoon.basic1.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfGCD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int[] nums = new int[Integer.parseInt(input[0])];
            for (int j = 0; j < nums.length; j++) {
                nums[j] = Integer.parseInt(input[j+1]);
            }
            long result = 0;

            for (int j = 0; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    result += gcd(nums[j], nums[k]);
                }
            }

            sb.append(result + "\n");

        }

        System.out.println(sb);
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
//출력 결과 범위 확인
//9613 GCD 합