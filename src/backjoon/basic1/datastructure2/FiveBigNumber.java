package backjoon.basic1.datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FiveBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<Integer> a = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            answer.add(-1);
        }

        Stack<Integer> stack = new Stack<>();

        String[] input = bufferedReader.readLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            a.add(Integer.parseInt(input[i]));
        }

        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.empty() && a.get(stack.get(stack.size()-1)) < a.get(i)) {
                answer.set(stack.pop(), a.get(i));
            }
            stack.push(i);
        }

        System.out.println(answer.toString().replace("[", "").replace("]", "").replace(",", ""));

    }
}
//17298 오큰수