package backjoon.basic.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxValue {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int max = 0;
//        int maxIndex = 1;
//
//        for(int i = 0; i < 9; i++) {
//            int n = Integer.parseInt(bufferedReader.readLine());
//
//            if (i == 0) {
//                max = n;
//            } else {
//                if (max < n) {
//                    max = n;
//                    maxIndex = i+1;
//                }
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(maxIndex);

        int[] nums = new int[9];
        for(int i = 0; i < nums.length; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            nums[i] = n;
        }

        int max = nums[0];
        int maxIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i+1;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }
}
//2562 최댓값
