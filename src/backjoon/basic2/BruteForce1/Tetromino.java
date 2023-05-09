package backjoon.basic2.BruteForce1;

// 시간초과
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Tetromino {
//
//    static int result;
//    static int n;
//    static int m;
//    static int[][] board;
//    static boolean[][] visited;
//
//    static int[][] move;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] input = br.readLine().split(" ");
//        n = Integer.parseInt(input[0]);
//        m = Integer.parseInt(input[1]);
//        board = new int[n][m];
//        visited = new boolean[n][m];
//        for (int i = 0; i < n; i++) {
//            String[] s = br.readLine().split(" ");
//            for (int j = 0; j < m; j++) {
//                board[i][j] = Integer.parseInt(s[j]);
//                visited[i][j] = false;
//            }
//        }
//
//        result = 0;
//        move = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                visited[i][j] = true;
//                dfs(i, j, board[i][j], 1);
//                visited[i][j] = false;
//
//                exce(i, j);
//            }
//        }
//
//        System.out.println(result);
//    }
//
//    private static void dfs(int i, int j, int dsum, int cnt) {
//        if (cnt == 4) {
//            result = Math.max(result, dsum);
//        }
//
//        for (int k = 0; k < 4; k++) {
//            int ni = i + move[k][0];
//            int nj = j + move[k][1];
//            if (ni >= 0 && ni < n && nj >=0 && nj < m && !visited[ni][nj]) {
//                visited[ni][nj] = true;
//                dfs(ni, nj, dsum + board[ni][nj], cnt + 1);
//                visited[ni][nj] = false;
//            }
//        }
//    }
//    private static void exce(int i, int j) {
//        for (int k = 0; k < 4; k++) {
//            int tmp = board[i][j];
//            for (int l = 0; l < 3; l++) {
//                int t = (l + k) % 4;
//                int ni = i + move[t][0];
//                int nj = j + move[t][1];
//
//                if(!(ni >= 0 && ni < n && nj >=0 && nj < m)) {
//                    tmp = 0;
//                    break;
//                }
//                tmp += board[ni][nj];
//            }
//            result = Math.max(result, tmp);
//        }
//    }
//}
//14500 테트로미노
//https://developer-u.tistory.com/103

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tetromino {
    static int N, M, max = Integer.MIN_VALUE;
    static int[][] map;
    static boolean[][] visited;

    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int y = 0; y < N; y++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int x = 0; x < M; x++) {
                map[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                visited[y][x] = true;
                dfs(y, x, 1, map[y][x]);
                visited[y][x] = false;

                combi(0, 0, y, x, map[y][x]);	//인접한 4칸 중 3칸 고르기(ㅗ,ㅓ,ㅏ,ㅜ 모양)
            }
        }

        System.out.println(max);

        br.close();

    }

    private static void combi(int cnt, int start, int y, int x, int sum) {
        if(cnt == 3) {
            max = Math.max(max, sum);
            return;
        }

        for (int d = start; d < 4; d++) {
            int ny = y + dy[d];
            int nx = x + dx[d];

            if(ny<0 || ny>=N || nx<0 || nx>=M) continue;

            combi(cnt+1, d+1, y, x, sum+map[ny][nx]);
        }
    }


    private static void dfs(int y, int x, int cnt, int sum) {

        if(cnt == 4) {
            max = Math.max(max, sum);
            return;
        }

        for (int d = 0; d < 4; d++) {
            int ny = y + dy[d];
            int nx = x + dx[d];

            if(ny<0 || ny>=N || nx<0 || nx>=M) continue;
            if(visited[ny][nx]) continue;

            visited[ny][nx] = true;
            dfs(ny, nx, cnt+1, sum+map[ny][nx]);
            visited[ny][nx] = false;
        }

    }
}
