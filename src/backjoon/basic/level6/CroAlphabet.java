package backjoon.basic.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        input = input.replace("c=", "*");
        input = input.replace("c-", "*");
        input = input.replace("dz=", "*");
        input = input.replace("d-", "*");
        input = input.replace("lj", "*");
        input = input.replace("nj", "*");
        input = input.replace("s=", "*");
        input = input.replace("z=", "*");
        System.out.println(input.length());
    }
}
// 2941 크로아티아 알파벳