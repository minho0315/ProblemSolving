package backjoon.basic1.datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bufferedReader.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 97; i < 123; i++) {
            char alphabet = (char) i;
            boolean isFind = false;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == alphabet && !isFind) {
                    sb.append(j + " ");
                    isFind = true;
                }
            }
            if (!isFind) {
                sb.append(-1 + " ");
            }
        }
        System.out.println(sb);
    }
}
//10809 알파벳 찾기
