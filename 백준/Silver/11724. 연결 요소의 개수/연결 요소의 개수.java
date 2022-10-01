import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();

            // code

            StringTokenizer neInput = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(neInput.nextToken());
            int E = Integer.parseInt(neInput.nextToken());

            graph = new ArrayList[N+1];
            visited = new boolean[N+1];

            for (int i = 1; i < N+1; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < E; i++) {
                StringTokenizer eInput = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(eInput.nextToken());
                int end = Integer.parseInt(eInput.nextToken());

                graph[start].add(end);
                graph[end].add(start);
            }

            int connectionComponentCount = 0;
            for (int i = 1; i < graph.length; i++) {
                if (!visited[i]) {
                    connectionComponentCount++;
                    dfs(i);
                }
            }

            sb.append(connectionComponentCount);

            bw.write(sb.toString());
            bw.flush();
        }
    }

    static void dfs(int index) {
        if (visited[index]) return;

        visited[index] = true;
        for (int current : graph[index]) {
            dfs(current);
        }
    }
}