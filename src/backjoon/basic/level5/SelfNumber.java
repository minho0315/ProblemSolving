package backjoon.basic.level5;

public class SelfNumber {

    private static int d(int n) {
        int answer = n;
        while (n != 0) {
            answer += n%10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = new int[10001];

        for (int i = 0; i < 10001; i++) {
            int di = d(i);
            if (di <= 10000) {
                nums[di] = 1;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if (nums[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
//4673 셀프 넘버