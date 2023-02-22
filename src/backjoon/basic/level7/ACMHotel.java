package backjoon.basic.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACMHotel {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < t; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            int h = Integer.parseInt(input[0]);
            int w = Integer.parseInt(input[1]);
            int n = Integer.parseInt(input[2]);

            int xx = n / h + 1;
            int yy = n % h;

            if (yy == 0) {
                xx = n / h;
                yy = h;
            }
            System.out.println(yy * 100 + xx);
        }
    }
}
//10250 ACM 호텔