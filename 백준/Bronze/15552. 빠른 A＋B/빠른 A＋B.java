
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();

            Integer n = Integer.valueOf(br.readLine());

            for (int i=0; i<n; i++) {
                StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
                int result = Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken());
                sb.append(result).append("\n");
            }

            bw.write(sb.toString());
            bw.flush();
        }
    }
}