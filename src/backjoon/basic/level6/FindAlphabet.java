package backjoon.basic.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bufferedReader.readLine().toCharArray();
        for (int i = 97; i < 123; i++) {
            char alphabet = (char) i;
            boolean isFind = false;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == alphabet && !isFind) {
                    System.out.print(j + " ");
                    isFind = true;
                }
            }
            if (!isFind) {
                System.out.print(-1 + " ");
            }
        }
    }
}
