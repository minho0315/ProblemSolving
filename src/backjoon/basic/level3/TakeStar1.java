package backjoon.basic.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeStar1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//2438 별 찍기 - 1