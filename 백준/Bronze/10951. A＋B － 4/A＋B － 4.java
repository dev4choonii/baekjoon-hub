import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer numbers = new StringTokenizer(line);
                int a = Integer.parseInt(numbers.nextToken());
                int b = Integer.parseInt(numbers.nextToken());
                int sum = a + b;

                sb.append(sum).append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}