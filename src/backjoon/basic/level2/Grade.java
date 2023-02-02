package backjoon.basic.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grade {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int grade = Integer.parseInt(bufferedReader.readLine());

        if (90 <= grade && grade <= 100) {
            System.out.println("A");
        } else if (80 <= grade && grade <= 89) {
            System.out.println("B");
        } else if (70 <= grade && grade <= 79) {
            System.out.println("C");
        } else if (60 <= grade && grade <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
//9498 시험 성적