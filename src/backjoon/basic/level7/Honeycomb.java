package backjoon.basic.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Honeycomb {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int cnt = 1;
        int num = 1;

        while (n > num) {
            num += 6 * cnt;
            cnt += 1;
        }

        System.out.println(cnt);
    }
}
//2292 벌집