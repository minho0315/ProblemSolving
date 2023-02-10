package backjoon.basic.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallerThanX {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);
        int[] numbers = new int[n];

        String[] input2 = bufferedReader.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(input2[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < x) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
