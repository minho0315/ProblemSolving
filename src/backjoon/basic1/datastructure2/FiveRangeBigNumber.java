package backjoon.basic1.datastructure2;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Stack;
//
////시간초과
//public class FiveRangeBigNumber {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bufferedReader.readLine());
//
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            result.add(-1);
//        }
//
//        List<Integer> a = new ArrayList<>();
//        String[] input = bufferedReader.readLine().split(" ");
//        for (int i = 0; i < n; i++) {
//            a.add(Integer.parseInt(input[i]));
//        }
//
//        Stack<Integer> stack = new Stack<>();
//        stack.add(0);
//
//        List<Integer> count = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            count.add(Collections.frequency(a, a.get(i)));
//        }
//
//        for (int i = 1; i < n; i++) {
//            while (!stack.empty() && count.get(a.get(stack.peek())) < count.get(a.get(i))) {
//                result.set(stack.pop(), a.get(i));
//            }
//            stack.push(i);
//        }
//
//        System.out.println(result.toString().replace("[","").replace("]","").replace(",", ""));
//    }
//}

// https://loosie.tistory.com/615
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class FiveRangeBigNumber {
    static final int MAX = 1_000_001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int count[] = new int[MAX];
        int index[] = new int[n];
        int ans[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            index[i] = Integer.parseInt(st.nextToken());
            count[index[i]]++;
        }

        for (int i = 0; i < n; i++) {
            while (!stack.empty() && count[index[i]] > count[index[stack.peek()]]) {
                ans[stack.pop()] = index[i];
            }
            stack.push(i);
        }

        while(!stack.empty()) {
            ans[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ans[i] + " ");
        }
        System.out.println(sb.toString());
    }
}
