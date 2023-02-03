package backjoon.basic.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alarm {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);

        if (minute >= 45) {
            minute -= 45;
        } else {
            minute = minute + 15;
            if (hour >= 1) {
                hour -= 1;
            } else {
                hour = 23;
            }
        }

        System.out.println(hour + " " + minute);
    }
}
