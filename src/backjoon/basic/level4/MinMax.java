package backjoon.basic.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int max = -1000001;
        int min = 1000001;

        String[] input = bufferedReader.readLine().split(" ");

//        for (int i = 0; i < input.length; i++) {
//            int num = Integer.parseInt(input[i]);
//            if (max <= num) {
//                max = num;
//            }
//
//            if (min >= num) {
//                min = num;
//            }
//        }

        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        System.out.println(min + " " + max);

    }
}
