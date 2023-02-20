package backjoon.basic.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFountain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int num = 1;
        int cnt = 1;

        while (n > num) {
            num += cnt+1;
            cnt++;
        }

        int result = num - n + 1;

        if (cnt %  2 == 0) {
            System.out.printf("%d/%d", cnt + 1 - result, result);
        } else {
            System.out.printf("%d/%d", result, cnt + 1 - result);
        }
    }
}
//1193 분수찾기