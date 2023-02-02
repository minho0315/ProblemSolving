package backjoon.basic.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareTwoNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
//1330 두 수 비교하기
