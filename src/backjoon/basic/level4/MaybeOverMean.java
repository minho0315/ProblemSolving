package backjoon.basic.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaybeOverMean {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            int count = Integer.parseInt(input[0]);
            double sumScore = 0;

            for (int j = 1; j < input.length; j++) {
                int score = Integer.parseInt(input[j]);
                sumScore += score;
            }

            double mean = sumScore / count;
            double higherScoreCount = 0.0;

            for (int j = 1; j < input.length; j++) {
                int score = Integer.parseInt(input[j]);
                if (score > mean) {
                    higherScoreCount++;
                }
            }

            double result = higherScoreCount / count * 100;

            System.out.printf("%.3f%%\n", result);
        }
    }
}
