package backjoon.basic1.datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SuffixArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] suffixs = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            suffixs[i] = input.substring(i);
        }

        Arrays.sort(suffixs);

        for (int i = 0; i < suffixs.length; i++) {
            System.out.println(suffixs[i]);
        }

    }
}
//11656 접미사 배열
