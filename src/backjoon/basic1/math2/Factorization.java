package backjoon.basic1.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Factorization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> result = new ArrayList<>();

        while (n > 1) {
            for (int i = 2; i < n + 1; i++) {
                if (n % i == 0) {
                    result.add(i);
                    n = n / i;
                    break;
                }
            }
        }

        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
//11653 소인수분해