package backjoon.basic2.BruteForce1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

    static List<String> remote;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String[] input = new String[0];
        if (m != 0) {
            input = br.readLine().split(" ");
        }

        remote = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            remote.add(Integer.toString(i));
        }

        for (int i = 0; i < m; i++) {
            remote.remove(input[i]);
        }

        int result = Math.abs(100 - n);

        for (int i = 0; i < 1000000; i++) {
            String num = Integer.toString(i);
            for (int j = 0; j < num.length(); j++) {
                if (!check(num.charAt(j))) {
                    break;
                }

                if (j == num.length()-1) {
                    result = Math.min(result, Math.abs(n-i) + num.length());
                }
            }
        }

        System.out.println(result);
    }

    private static boolean check(char c) {
        for (String s : remote) {
            if (c == s.charAt(0)) {
                return true;
            }
        }
        return false;
    }
}
// https://jennnn.tistory.com/60
// 1107 리모컨