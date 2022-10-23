import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            StringTokenizer input;

            input = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(input.nextToken());
            int m = Integer.parseInt(input.nextToken());

            input = new StringTokenizer(br.readLine());
            final int[] numbers = new int[n+1];
            final int[] summaries = new int[n+1];
            for (int i = 1; i <= n; i++) {
                numbers[i] = Integer.parseInt(input.nextToken());

                if (i == 1) {
                    summaries[i] = numbers[i];
                    continue;
                }

                summaries[i] = summaries[i-1] + numbers[i];
            }

            for (int i = 0; i < m; i++) {
                input = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(input.nextToken());
                int to = Integer.parseInt(input.nextToken());
                int result = summaries[to] - summaries[from-1];
                sb.append(result).append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}