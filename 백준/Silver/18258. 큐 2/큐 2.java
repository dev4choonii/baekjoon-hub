import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            Queue<Integer> queue = new LinkedList<>();
            int n = Integer.parseInt(br.readLine());
            int lastValue = 0;
            for (int i = 0; i < n; i++) {
                StringTokenizer input = new StringTokenizer(br.readLine());
                String command = input.nextToken();

                if ("push".equals(command)) {
                    int value = Integer.parseInt(input.nextToken());
                    lastValue = value;
                    queue.add(value);
                } else if ("pop".equals(command)) {
                    sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
                } else if ("size".equals(command)) {
                    sb.append(queue.size()).append("\n");
                } else if ("empty".equals(command)) {
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                } else if ("front".equals(command)) {
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                } else if ("back".equals(command)) {
                    sb.append(queue.isEmpty() ? -1 : lastValue).append("\n");
                }
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}