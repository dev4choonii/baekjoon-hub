import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            int n = Integer.parseInt(br.readLine());

            Queue<Integer> cardQueue = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                cardQueue.add(i);
            }

            while (!cardQueue.isEmpty()) {
                if (cardQueue.size() == 1) {
                    sb.append(cardQueue.poll());
                    break;
                }

                cardQueue.poll();

                int top = cardQueue.poll();
                cardQueue.add(top);
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}