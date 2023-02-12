package backjoon.basic.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        double[] nums = new double[n];
        double maxNum = 0;
        String[] input = bufferedReader.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(input[i]);
            nums[i] = num;
            if (maxNum < num) {
                maxNum = num;
            }
        }

        double sumNum = Arrays.stream(nums).sum();

        double result = sumNum / maxNum * 100 / nums.length;

        System.out.println(result);

    }
}
//1546 평균