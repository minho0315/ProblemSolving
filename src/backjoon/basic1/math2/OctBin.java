package backjoon.basic1.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctBin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String n = br.readLine();

        for (int i = 0; i < n.length(); i++) {
            String a = Integer.toBinaryString(n.charAt(i) - '0');
            if (a.length() == 2 && i != 0) {
                a = "0" + a;
            } else if (a.length() == 1 && i != 0) {
                a = "00" + a;
            }
            sb.append(a);
        }
        System.out.println(sb);
    }
}
//1212 8진수 2진수