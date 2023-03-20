package backjoon.basic1.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldbachPartition {

    static boolean[] prime_nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        getPrimeNumbers();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int j = 1; j <= n/2; j++) {
                int a = j;
                int b = n - j;
                if (prime_nums[a] && prime_nums[b]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    private static void getPrimeNumbers() {
        prime_nums = new boolean[1000001];

        for (int i = 2; i <= 1000000; i++) {
            prime_nums[i] = true;
        }

        for (int i = 2; i <= 1000000; i++) {
            if (!prime_nums[i]) {
                continue;
            }

            for (int j = 2 * i; j <= 1000000; j += i) {
                prime_nums[j] = false;
            }
        }
    }
}
//17103 골드바흐 파티션