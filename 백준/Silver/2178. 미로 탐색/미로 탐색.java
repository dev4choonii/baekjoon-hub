import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;
    static int[][] A;
    static int N, M;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {


            // code

            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            N = Integer.parseInt(stringTokenizer.nextToken());
            M = Integer.parseInt(stringTokenizer.nextToken());
            A = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < N; i++) {
                String line = br.readLine();
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(line.substring(j, j+1));
                }
            }

            bfs(0, 0);

            sb.append(A[N-1][M-1]);

            ////////////////////

            bw.write(sb.toString());
            bw.flush();
        }
    }

    static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j}); // 현재 좌표 0,0 (파라미터로 0, 0넣음)

        // while 시작과 동시에 좌표 0,0에서 시작
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            visited[i][j] = true;
            for (int k = 0; k < 4; k++) { // 현재 좌표에서 상하좌우로 탐색(4번이니까 k<4)
                int x = current[0] + dx[k];
                int y = current[1] + dy[k];

                if (x >= 0 && y >= 0 && x < N && y < M) { // 유효성 검사. 넘어갈 수 없는 범위 체크
                    if (A[x][y] != 0 && !visited[x][y]) { // xy 상하좌우값을 A(map(지도))에 좌표 넣고 돌림. 방문하지 않은 좌표(노드) 검사.
                        // 현재 조건은 0이면 갈수 없음.
                        // 들어온것은 1이라는거임. 갈 수 있음.
                        visited[x][y] = true;
                        A[x][y] = A[current[0]][current[1]] + 1; // 이 부분 중요. depth.
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}