package backjoon.basic1.math1;

import java.io.*;
import java.util.StringTokenizer;

public class FindPrimeNumber2 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] input = br.readLine().split(" ");
//        int m = Integer.parseInt(input[0]);
//        int n = Integer.parseInt(input[1]);
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = m; i < n+1; i++) {
//            if (i == 1) {
//                continue;
//            }
//            boolean isPN = true;
//            for (int j = 2; j < Math.sqrt(i) + 1; j++) {
//                if (i % j == 0) {
//                    isPN = false;
//                    break;
//                }
//            }
//            if (isPN) {
//                sb.append(i + "\n");
//            }
//        }
//        System.out.println(sb);
//    }

    //https://yermi.tistory.com/entry/%EB%B0%B1%EC%A4%80BOJ-1929%EB%B2%88-%EC%86%8C%EC%88%98-%EA%B5%AC%ED%95%98%EA%B8%B0-JAVA-%EC%9E%90%EB%B0%94
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for( ; a <= b ; a++) {
            boolean flag = true;

            if(a == 1) {
                continue;
            }

            for(int j = 2 ; j <= Math.sqrt(a) ; j++) {
                if(a % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                bw.write(a + "\n");
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
//1929 소수 구하기