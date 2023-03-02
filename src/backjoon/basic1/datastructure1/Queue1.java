package backjoon.basic1.datastructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int last = 0;

        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] cmd = br.readLine().split(" ");

            if (cmd[0].equals("push")) {
                queue.add(cmd[1]);
                last = Integer.parseInt(cmd[1]);
            } else if (cmd[0].equals("pop")) {
                if (queue.isEmpty()) {
                    result.add("-1");
                } else {
                    result.add(queue.remove());
                }
            } else if (cmd[0].equals("size")) {
                result.add(String.valueOf(queue.size()));
            } else if (cmd[0].equals("empty")) {
                if (queue.isEmpty()) {
                    result.add("1");
                } else {
                    result.add("0");
                }
            } else if (cmd[0].equals("front")) {
                if (queue.isEmpty()) {
                    result.add("-1");
                } else {
                    result.add(queue.peek());
                }
            } else if (cmd[0].equals("back")) {
                if (queue.isEmpty()) {
                    result.add("-1");
                } else {
                    result.add(String.valueOf(last));
                }
            }
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}
//10845 큐