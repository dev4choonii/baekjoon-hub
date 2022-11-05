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
                long a = Long.parseLong(numbers.nextToken());
                long b = Long.parseLong(numbers.nextToken());
                if (a == 0 && b == 0) {
                    break;
                }
                
                sb.append(a > b ? "Yes" : "No").append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}