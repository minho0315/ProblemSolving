package backjoon.basic.level4;

import java.io.*;
import java.util.*;

public class Count {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bufferedReader.readLine());
//        List<Integer> integers = new ArrayList<>();
//
//        String[] input = bufferedReader.readLine().split(" ");
//
//        for (int i = 0; i < n; i++) {
//            integers.add(Integer.parseInt(input[i]));
//        }
//
//        int v = Integer.parseInt(bufferedReader.readLine());
//
//        System.out.println(Collections.frequency(integers, v));
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] integers = new int[n];

        String[] input = bufferedReader.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            integers[i] = Integer.parseInt(input[i]);
        }

        int v = Integer.parseInt(bufferedReader.readLine());

        int count = 0;

        for (int i = 0; i < n; i++) {
            if(integers[i] == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}
