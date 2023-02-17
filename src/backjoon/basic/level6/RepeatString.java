package backjoon.basic.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            String s = input[1];
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < s.length(); j++) {
                String c = String.valueOf(s.charAt(j));
                sb.append(c.repeat(r));
            }
            System.out.println(sb.toString());
        }
    }
}
//2675 문자열 반복