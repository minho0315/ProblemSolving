package backjoon.basic1.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CountOfFactorialZero {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        BigInteger nFactorial = new BigInteger("1");
//        int result = 0;
//
//        for (int i = 1; i < n+1; i++) {
//            nFactorial = nFactorial.multiply(new BigInteger(String.valueOf(i)));
//        }
//
//        String s = String.valueOf(nFactorial);
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) != '0') {
//                break;
//            }
//            result++;
//        }
//
//        System.out.println(result);
//    }

    //다른 풀이
    //뒷자리 0의 개수는 n을 소인수 분해하여 2와 5가 짝지어 지는 만큼
    //팩토리얼 값에서 2의 개수가 5의 개수보다 많다
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while(n >= 5) {				//5의 개수를 구하는 반복문
            count += n / 5;
            n /= 5;
        }
        System.out.println(count);
    }
}
//1676 팩토리얼 0의 개수