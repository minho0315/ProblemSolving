package backjoon.basic1.datastructure1;

import java.io.*;
import java.util.Stack;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int cur = 1;
        boolean flag = true;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            while (cur <= num) {
                stack.push(cur);
//                bw.write("+\n");
                sb.append("+\n");
                cur += 1;
            }

            if (stack.peek() == num) {
                stack.pop();
//                bw.write("-\n");
                sb.append("-\n");
            } else {
                System.out.println("NO");
                flag = false;
                break;
            }
        }

        if (flag) {
//            bw.flush();
//            bw.close();
            System.out.println(sb);
        }
    }
}
//1874 스택 수열
