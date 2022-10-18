import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                StringTokenizer input = new StringTokenizer(br.readLine(), "X");
                int point = 0;
                while (input.hasMoreTokens()) {
                    String quizResult = input.nextToken();
                    for (int j = 1; j <= quizResult.length(); j++) {
                        point += j;
                    }

                }
                sb.append(point).append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}