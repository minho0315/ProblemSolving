package backjoon.basic.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        int c = n;

        if (n < 10) {
            c *= 10;
        }

        int a = c / 10;
        int b = c % 10;
        c = (n%10)*10 + (a+b)%10;
        count++;

        if (c == n) {
            System.out.println(count);
        } else {
            while (true) {
                c = (c%10)*10 + (a+b)%10;
                count++;

                if (c == n) {
                    System.out.println(count);
                    break;
                }
                else {
                    a = c / 10;
                    b = c % 10;
                }
            }
        }
    }
}
