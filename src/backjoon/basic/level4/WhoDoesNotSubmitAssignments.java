package backjoon.basic.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WhoDoesNotSubmitAssignments {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] attendance = new int[30];
        for (int i = 0; i < attendance.length; i++) {
            attendance[i] = i+1;
        }

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            attendance = Arrays.stream(attendance)
                    .filter(n -> n != num)
                    .toArray();
        }

        System.out.println(attendance[0]);
        System.out.println(attendance[1]);
    }
}
//5597 과제 안 내신 분...?