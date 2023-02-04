package backjoon.basic.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OvenClock {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);
        int cookingTime = Integer.parseInt(bufferedReader.readLine());
        System.out.println((hour + ((minute + cookingTime) / 60)) % 24 + " " + (minute + cookingTime) % 60);
    }
}
