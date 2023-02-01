package backjoon.basic.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiply {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        System.out.println(num1 * (num2 % 10));
        System.out.println(num1 * ((num2 / 10) % 10));
        System.out.println(num1 * ((num2 / 100) % 10));
        System.out.println(num1 * num2);
    }
}

//2588 곱셈