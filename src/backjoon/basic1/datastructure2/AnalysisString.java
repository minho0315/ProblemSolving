package backjoon.basic1.datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnalysisString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null) {
            int[] result = new int[4];
            for (int i = 0; i < input.length(); i++) {
                if (Character.isLowerCase(input.charAt(i))) {
                    result[0] += 1;
                } else if (Character.isUpperCase(input.charAt(i))) {
                    result[1] += 1;
                } else if (Character.isDigit(input.charAt(i))) {
                    result[2] += 1;
                } else {
                    result[3] += 1;
                }
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }
}
//10820 문자열 분석