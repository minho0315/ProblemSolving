package backjoon.basic1.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Josephus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        Queue<Integer> result = new LinkedList<>();
        Queue<Integer> people = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            people.add(i+1);
        }

        while (!people.isEmpty()) {
            for (int i = 0; i < k-1; i++) {
                people.add(people.remove());
            }
            result.add(people.remove());
        }

        System.out.println(result.toString().replace('[', '<').replace(']','>'));

    }
}
//1158 요세푸스 문제