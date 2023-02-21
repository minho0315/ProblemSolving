package backjoon.basic.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnailWantsToClimb {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        double a = Integer.parseInt(input[0]);
        double b = Integer.parseInt(input[1]);
        double v = Integer.parseInt(input[2]);

        double day = (v - b) / (a - b);
        int result = (int) Math.ceil(day);
        System.out.println(result);
    }
}
//2869 달팽이는 올라가고 싶다