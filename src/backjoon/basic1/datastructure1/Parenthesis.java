package backjoon.basic1.datastructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            char[] ps = bufferedReader.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean isBreak = false;

            for (int j = 0; j < ps.length; j++) {

                if (ps[j] == '(') {
                    stack.add('C');
                } else if (ps[j] == ')') {
                    if (!stack.empty()) {
                        stack.pop();
                    } else {
                        System.out.println("NO");
                        isBreak = true;
                        break;
                    }
                }
            }

            if (!isBreak) {
                if (stack.empty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
//9012 괄호