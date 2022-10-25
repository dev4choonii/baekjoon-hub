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
            StringTokenizer numbers = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(br.readLine());

            int count = 0;
            while (numbers.hasMoreTokens()) {
                if (v == Integer.parseInt(numbers.nextToken())) {
                    count++;
                }
            }

            sb.append(count);

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}