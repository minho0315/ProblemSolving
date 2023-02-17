package backjoon.basic.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class StudyWord {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine().toUpperCase(Locale.ROOT);
        char maxChar = '\0';
        long maxNum = 0;
        for (int i = 0; i < 26; i++) {
            char ch = (char)(i+65);
            long count = s.chars().filter(c -> c == ch).count();
            if (maxNum < count) {
                maxChar = ch;
                maxNum = count;
            } else if (maxNum == count) {
                maxChar = '?';
            }
        }
        System.out.println(maxChar);

    }
}
//1157 단어공부