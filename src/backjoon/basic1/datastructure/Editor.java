package backjoon.basic1.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Editor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = bufferedReader.readLine().toCharArray();
        int m = Integer.parseInt(bufferedReader.readLine());
        Stack<Character> right = new Stack<>();
        Stack<Character> left = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            left.push(chars[i]);
        }

        for (int i = 0; i < m; i++) {
            char[] cmd = bufferedReader.readLine().toCharArray();

            if (cmd[0] == 'L') {
                if (!left.empty()) {
                    right.push(left.pop());
                }
            } else if (cmd[0] == 'D') {
                if (!right.empty()) {
                    left.push(right.pop());
                }
            } else if (cmd[0] == 'B') {
                if (!left.empty()) {
                    left.pop();
                }
            } else {
                left.push(cmd[2]);
            }
        }

        while (!left.empty()) {
            right.push(left.pop());
        }

        StringBuilder sb = new StringBuilder();
        while (!right.empty()) {
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}
//1406 에디터
//https://blog.naver.com/PostView.nhn?blogId=ajy7424&logNo=222495771176