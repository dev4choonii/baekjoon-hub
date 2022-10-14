import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            Stack<Integer> stack = new Stack<>();

            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                StringTokenizer commandInput = new StringTokenizer(br.readLine());
                String command = commandInput.nextToken();
                if ("push".equals(command)) {
                    int data = Integer.parseInt(commandInput.nextToken());
                    stack.push(data);
                } else if ("pop".equals(command)) {
                    if (!stack.empty()) {
                        sb.append(stack.pop()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                } else if ("size".equals(command)) {
                    sb.append(stack.size()).append("\n");
                } else if ("empty".equals(command)) {
                    sb.append(stack.empty() ? 1 : 0).append("\n");
                } else if ("top".equals(command)) {
                    if (!stack.empty()) {
                        sb.append(stack.peek()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                }
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}