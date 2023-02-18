package backjoon.basic.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            String s = bufferedReader.readLine();
            boolean isGroupWord = true;
            for (int j = 0; j < s.length() - 1 ; j++) {
                if (s.charAt(j) != s.charAt(j+1)) {
                    String subS = s.substring(j+1);
                    if (subS.contains(String.valueOf(s.charAt(j)))) {
                        isGroupWord = false;
                    }
                }
            }

            if (isGroupWord) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
//1316 그룹 단어 체커