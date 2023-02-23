package backjoon.basic.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int result = 0;
        boolean isBreak = false;
        while (n >= 0) {
            if (n % 5 == 0) {
                result += n / 5;
                isBreak = true;
                break;
            }
            n -= 3;
            result += 1;
        }
        if (isBreak) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}
//2839 설탕 배달