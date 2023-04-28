package backjoon.basic2.BruteForce1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandyGame {
    static String[][] candy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        candy = new String[n][n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                candy[i][j] = input[j];
            }
        }
        int result = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j+1 < n) {
                    String tempCandy = candy[i][j];
                    candy[i][j] = candy[i][j+1];
                    candy[i][j+1] = tempCandy;

                    int temp = check();
                    if (temp > result) {
                        result = temp;
                    }

                    tempCandy = candy[i][j];
                    candy[i][j] = candy[i][j+1];
                    candy[i][j+1] = tempCandy;
                }

                if (i+1 < n) {
                    String tempCandy = candy[i][j];
                    candy[i][j] = candy[i+1][j];
                    candy[i+1][j] = tempCandy;

                    int temp = check();
                    if (temp > result) {
                        result = temp;
                    }

                    tempCandy = candy[i][j];
                    candy[i][j] = candy[i+1][j];
                    candy[i+1][j] = tempCandy;
                }
            }
        }

        System.out.println(result);
    }

    private static int check() {
        int result = 1;

        for (int i = 0; i < candy.length; i++) {
            int cnt = 1;
            for (int j = 1; j < candy.length; j++) {
                if (candy[i][j-1].equals(candy[i][j])) {
                    cnt++;
                } else {
                    cnt = 1;
                }

                if (result < cnt) {
                    result = cnt;
                }
            }

            cnt = 1;
            for (int j = 1; j < candy.length; j++) {
                if (candy[j-1][i].equals(candy[j][i])) {
                    cnt++;
                } else {
                    cnt = 1;
                }

                if (result < cnt) {
                    result = cnt;
                }
            }
        }

        return result;
    }
}
// 3085 사탕 게임
// https://enhjh.tistory.com/43