package backjoon.basic2.BruteForce1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteAfterNumber1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = 0L;

        for (int i = 0; i < String.valueOf(n).length(); i++) {
            result += 9 * Math.pow(10, i) * (i + 1);
        }

        result += (n + 1 - Math.pow(10,String.valueOf(n).length())) * String.valueOf(n).length();

        System.out.println(result);
    }
}
//1748 수 이어 쓰기 1
// https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-1748%EB%B2%88-%EC%88%98-%EC%9D%B4%EC%96%B4-%EC%93%B0%EA%B8%B0-1-%ED%8C%8C%EC%9D%B4%EC%8D%ACPython