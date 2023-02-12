package backjoon.basic.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Remain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        List<Integer> nums = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            int num = Integer.parseInt(bufferedReader.readLine());
//            nums.add(num%42);
//        }
//
//        nums = nums.stream().distinct().collect(Collectors.toList());
//
//        System.out.println(nums.size());

        HashSet<Integer> nums = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            nums.add(num % 42);
        }
        System.out.println(nums.size());
    }
}
//3052 나머지