package backjoon.basic1.math1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GoldbachConjecture {
    //틀림
//    public static void main(String[] args) throws IOException {
//        List<Integer> prime = new ArrayList<>();
//        boolean[] primeCheck = new boolean[1000001];
//
//        for (int i = 2; i < primeCheck.length; i++) {
//            if (!primeCheck[i]) {
//                prime.add(i);
//                for (int j = i + i; j < primeCheck.length; j += i) {
//                    primeCheck[j] = true;
//                }
//            }
//        }
//
//        while (true) {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//            String s = br.readLine();
//            if (s.equals("")) {
//                continue;
//            }
//
//            int n = Integer.parseInt(s);
//
//            if (n == 0) {
//                break;
//            }
//
//            for (int i = 1; i < prime.size(); i++) {
//                if (!primeCheck[n - prime.get(i)]) {
//                    System.out.printf("%d = %d + %d\n", n, prime.get(i), n - prime.get(i));
//                    break;
//                }
//            }
//        }
//    }

    // https://www.acmicpc.net/problem/6588
    static boolean[] prime_nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        primeNumberEratosthenesSieve();

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;

            int result = isPossible(n);

            if(result>0){
                bw.write(n+" = "+result+" + "+(n-result)+"\n");
            }else{
                bw.write("Goldbach's conjecture is wrong.");
            }
        }
        bw.flush();
    }

    public static int isPossible(int n){
        for(int i=1; i<=n/2; i++){
            int a = i;
            int b = n - i;
            if(prime_nums[a] && prime_nums[b]) return a;
        }
        return -1;
    }

    public static void primeNumberEratosthenesSieve() {
        prime_nums = new boolean[1000001];

        // initialize
        for(int i=2;i<=1000000;i++) {
            prime_nums[i] = true;
        }

        for(int i=2;i<=1000000;i++) {
            if(!prime_nums[i]) continue; // 이미 지워진 수라면 pass

            // 이미 지워진 숫자가 아니라면, 그 배수부터 출발하여 가능한 모든 숫자 지우기
            for(int j=2*i;j<=1000000; j+=i) {
                prime_nums[j] = false;
            }
        }
    }
}
//6588 골드바흐의 추측