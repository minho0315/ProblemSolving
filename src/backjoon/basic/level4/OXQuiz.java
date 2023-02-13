package backjoon.basic.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split("X");
            int result = 0;

            for (int j = 0; j < input.length; j++) {
                for (int k = 0; k < input[j].length(); k++) {
                    result += k+1;
                }
            }
            System.out.println(result);
        }
    }
}
//8958 OX 퀴즈