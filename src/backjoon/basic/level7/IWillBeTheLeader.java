package backjoon.basic.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IWillBeTheLeader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(bufferedReader.readLine());
            int n = Integer.parseInt(bufferedReader.readLine());

            int[] people = new int[n+1];
            for (int j = 1; j <= n; j++) {
                people[j] = j;
            }

            for (int j = 0; j < k; j++) {
                for (int l = 1; l <= n; l++) {
                    people[l] += people[l-1];
                }
            }
            System.out.println(people[n]);
        }
    }
}
//