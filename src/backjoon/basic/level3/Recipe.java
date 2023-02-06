package backjoon.basic.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recipe {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());

        int totalPrice = 0;

        for (int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            int price = Integer.parseInt(input[0]);
            int count = Integer.parseInt(input[1]);

            totalPrice += price * count;
        }

//        if (totalPrice == x) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
        System.out.println(totalPrice == x ? "Yes":"No");
    }
}
//25304 영수증