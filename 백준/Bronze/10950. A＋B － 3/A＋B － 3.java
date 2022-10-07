import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {
                StringTokenizer numbers = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(numbers.nextToken());
                int b = Integer.parseInt(numbers.nextToken());
                sb.append(a+b).append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}