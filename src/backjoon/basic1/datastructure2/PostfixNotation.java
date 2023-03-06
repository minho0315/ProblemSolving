package backjoon.basic1.datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PostfixNotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<String> alpha = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        char[] input = bufferedReader.readLine().toCharArray();

        for (int i = 0; i < n; i++) {
            alpha.add(bufferedReader.readLine());
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 'A' && input[i] <='Z') {
                stack.push(alpha.get(input[i] - 'A'));
            } else {
                double s2= Double.parseDouble(stack.pop());
                double s1= Double.parseDouble(stack.pop());
                if (input[i] == '+') {
                    stack.push(String.valueOf(s1 + s2));
                } else if (input[i] == '-') {
                    stack.push(String.valueOf(s1 - s2));
                } else if (input[i] == '*') {
                    stack.push(String.valueOf(s1 * s2));
                } else if (input[i] == '/') {
                    stack.push(String.valueOf(s1 / s2));
                }
            }
        }

        System.out.printf("%.2f", Double.parseDouble(stack.peek()));
    }
}
//1935 후위 표기식2