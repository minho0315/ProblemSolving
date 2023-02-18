package backjoon.basic.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Const {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] input = bufferedReader.readLine().split(" ");
//        StringBuffer stringBuffer1 = new StringBuffer();
//        stringBuffer1.append(input[0]);
//        int num1 = Integer.parseInt(stringBuffer1.reverse().toString());
//
//        StringBuffer stringBuffer2 = new StringBuffer();
//        stringBuffer2.append(input[1]);
//        int num2 = Integer.parseInt(stringBuffer2.reverse().toString());
//
//        if (num1 > num2) {
//            System.out.println(num1);
//        } else {
//            System.out.println(num2);
//        }
//    }

    //다른 풀이
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int num1 = Integer.parseInt(new StringBuffer(stringTokenizer.nextToken()).reverse().toString());
        int num2 = Integer.parseInt(new StringBuffer(stringTokenizer.nextToken()).reverse().toString());

        System.out.print(num1 > num2 ? num1:num2);
    }

}
//2908 상수