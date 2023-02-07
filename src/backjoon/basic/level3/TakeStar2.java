package backjoon.basic.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeStar2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(" ".repeat(n-i-1));
            stringBuilder.append("*".repeat(i+1));
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }
}
//2439 별 찍기 - 2
