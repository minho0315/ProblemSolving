package backjoon.basic1.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MakeOne {
//    https://bio-info.tistory.com/159
    //DP - BottomUp
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int x = Integer.parseInt(br.readLine());
//        int[] d = new int[x + 1];
//
//        for (int i = 2; i < x+1; i++) {
//            d[i] = d[i-1] + 1;
//
//            if (i % 2 == 0) {
//                d[i] = Math.min(d[i], d[i/2] + 1);
//            }
//
//            if (i % 3 == 0) {
//                d[i] = Math.min(d[i], d[i/3] + 1);
//            }
//        }
//
//        System.out.println(d[x]);
//    }

    private static HashMap<Integer, Integer> dp = new HashMap<>() {{
        put(1, 0);
    }};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println(rec(x));
    }

    private static int rec(int n) {

        if (dp.keySet().contains(n)) {
            return dp.get(n);
        }

        if (n%3 == 0 && n%2 == 0) {
            dp.put(n, Math.min(rec(n/2) + 1, rec(n/3) + 1));
        } else if (n % 3 == 0) {
            dp.put(n, Math.min(rec(n/3) + 1, rec(n-1) + 1));
        } else if (n % 2 == 0) {
            dp.put(n, Math.min(rec(n/2) + 1, rec(n-1) + 1));
        } else {
            dp.put(n, rec(n-1) + 1);
        }

        return dp.get(n);
    }
}
//1463 1로 만들기