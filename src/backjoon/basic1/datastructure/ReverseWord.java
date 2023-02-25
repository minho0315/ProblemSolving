package backjoon.basic1.datastructure;

import java.io.*;

public class ReverseWord {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                StringBuffer stringBuffer = new StringBuffer(input[j]);
                bufferedWriter.write(stringBuffer.reverse().toString() + " ");
            }
            bufferedWriter.write("\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
