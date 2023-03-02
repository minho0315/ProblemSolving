package backjoon.basic1.datastructure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Deque1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<String> d = new LinkedList<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] cmd = br.readLine().split(" ");

            if (cmd[0].equals("push_front")) {
                d.addFirst(cmd[1]);
            } else if (cmd[0].equals("push_back")) {
                d.addLast(cmd[1]);
            } else if (cmd[0].equals("pop_front")) {
                if (d.isEmpty()) {
                    result.add("-1");
                } else {
                    result.add(d.pollFirst());
                }
            } else if (cmd[0].equals("pop_back")) {
                if (d.isEmpty()) {
                    result.add("-1");
                } else {
                    result.add(d.pollLast());
                }
            } else if (cmd[0].equals("size")) {
                result.add(String.valueOf(d.size()));
            } else if (cmd[0].equals("empty")) {
                if (d.isEmpty()) {
                    result.add("1");
                } else {
                    result.add("0");
                }
            } else if (cmd[0].equals("front")) {
                if (d.isEmpty()) {
                    result.add("-1");
                } else {
                    result.add(d.peekFirst());
                }
            } else if (cmd[0].equals("back")) {
                if (d.isEmpty()) {
                    result.add("-1");
                } else {
                    result.add(d.peekLast());
                }
            }
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}
//10866 덱