package backjoon.basic.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ADyear {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        System.out.println(Integer.parseInt(s) - 2541 + 1998);
    }
}

//18108 1998년생인 내가 태국에서는 2541년생?!