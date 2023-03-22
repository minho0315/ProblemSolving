package backjoon.basic1.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseConversionEnglish {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int m = Integer.parseInt(br.readLine());

        String[] inputNumArr = br.readLine().split(" ");
        int[] numArr = new int[m];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(inputNumArr[i]);
        }

        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i] * (int) Math.pow(a, (m - i - 1));
        }

        List<Integer> result = new ArrayList<>();
        while (sum > 0) {
            result.add(sum%b);
            sum = sum / b;
        }

        Collections.reverse(result);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }

    }
}
