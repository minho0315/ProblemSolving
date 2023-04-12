package backjoon.basic1.dynamic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneTwoThreeAdd3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        List<Long> dp = new ArrayList<>(Arrays.asList(1L, 2L, 4L, 7L));
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = dp.size(); j < n; j++) {
                dp.add((dp.get(dp.size()-3) + dp.get(dp.size()-2) + dp.get(dp.size()-1)) % 1000000009);
            }
            System.out.println(dp.get(n-1));
        }
    }
}
//https://my-coding-notes.tistory.com/199
//15988 1, 2, 3 더하기 3