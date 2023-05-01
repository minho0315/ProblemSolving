package backjoon.basic2.BruteForce1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DateCalculation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int e = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int m = Integer.parseInt(input[2]);
        long year = 1;

        while (true) {
            if ((year - e) % 15 == 0 && (year - s) % 28 == 0 && (year - m) % 19 == 0)
            {
                break;
            }
            year++;
        }

        System.out.println(year);

    }
}
//1476 날짜 계산
//https://data-flower.tistory.com/54