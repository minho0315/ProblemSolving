package backjoon.basic1.datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!Character.isAlphabetic(chars[i])) {
                continue;
            }

            if (Character.isUpperCase(chars[i])) {
                chars[i] = (char) ((chars[i] + 13 - 65) % 26 + 65);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = (char) ((chars[i] + 13 - 97) % 26 + 97);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
//11655 ROT13
