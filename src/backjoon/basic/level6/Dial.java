package backjoon.basic.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bufferedReader.readLine().toCharArray();
        char[] exceps = new char[]{'S', 'V', 'Y', 'Z'};
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result += (chars[i] - 65)/3 + 3;
            for (int j = 0; j < exceps.length; j++) {
                if (exceps[j] == chars[i]) {
                    result -= 1;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
//5622 다이얼
