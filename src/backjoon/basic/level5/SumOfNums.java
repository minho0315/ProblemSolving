package backjoon.basic.level5;

import java.util.Arrays;

public class SumOfNums {

    long sum(int[] a) {
        long sum = 0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
}
