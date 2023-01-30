package backjoon.basic.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ADivisionB {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        System.out.println(a/b);
    }
}
//1008 A/B