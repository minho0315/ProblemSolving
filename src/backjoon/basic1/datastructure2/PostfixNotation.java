package backjoon.basic1.datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixNotation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] input = br.readLine().toCharArray();

        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 'A' && input[i] <='Z') {
                sb.append(input[i]);
            } else {
                if (input[i] == '(') {
                    stack.add(input[i]);
                } else if (input[i] == '*' || input[i] == '/') {
                    while (!stack.empty() && (stack.peek() == '*' || stack.peek() == '/')) {
                        sb.append(stack.pop());
                    }
                    stack.add(input[i]);
                } else if (input[i] == '+' || input[i] == '-') {
                    while (!stack.empty() && stack.peek() != '(') {
                        sb.append(stack.pop());
                    }
                    stack.add(input[i]);
                } else if (input[i] == ')') {
                    while (!stack.empty() && stack.peek() != '(') {
                        sb.append(stack.pop());
                    }
                    stack.pop();
                }
            }
        }
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
//1918 후위 표기식