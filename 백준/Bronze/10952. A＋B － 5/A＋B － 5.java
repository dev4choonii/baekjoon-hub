import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            while (true) {
                StringTokenizer numbers = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(numbers.nextToken());
                int b = Integer.parseInt(numbers.nextToken());
                int sum = a + b;
                if (sum == 0) {
                    break;
                }

                sb.append(sum).append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}