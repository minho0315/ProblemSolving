package backjoon.basic1.datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWord2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuffer sb = new StringBuffer(input);

        int i = 0;
        int start = 0;

        while (i < sb.length()) {
            if (sb.charAt(i) == '<') {
                i++;
                while (sb.charAt(i) != '>') {
                    i++;
                }
                i++;
            } else if (sb.charAt(i) == ' ') {
                i++;
            } else {
                start = i;
                while (i < sb.length() && sb.charAt(i) != ' ' && sb.charAt(i) != '<') {
                    i++;
                }
                StringBuffer temp  = new StringBuffer(sb.substring(start, i));
                sb.replace(start, i, temp.reverse().toString());
            }
        }

        System.out.println(sb);
    }
}
//17413 단어뒤집기2