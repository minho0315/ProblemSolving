package backjoon.basic.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneNumber {

    private static boolean checkOneNumber(int n) {
        if (n < 100) {
            return true;
        } else if ((n%10-n/10%10) != (n/10%10-n/100%10) || n == 1000) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if (checkOneNumber(i)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
//1065 한수