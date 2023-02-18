package backjoon.basic.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumOfWords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().trim().split(" ");

        if (input[0] == "") {
            System.out.println(0);
        } else {
            System.out.println(input.length);
        }
    }
}
//1152 단어의 개수