package backjoon.basic.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KingQueen {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        System.out.print(1 - Integer.parseInt(input[0]));
        System.out.print(" ");
        System.out.print(1 - Integer.parseInt(input[1]));
        System.out.print(" ");
        System.out.print(2 - Integer.parseInt(input[2]));
        System.out.print(" ");
        System.out.print(2 - Integer.parseInt(input[3]));
        System.out.print(" ");
        System.out.print(2 - Integer.parseInt(input[4]));
        System.out.print(" ");
        System.out.print(8 - Integer.parseInt(input[5]));

    }
}

//3003 킹, 퀸, 룩, 비숍, 나이트, 폰