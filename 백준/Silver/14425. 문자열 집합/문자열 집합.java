import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            StringTokenizer info = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(info.nextToken());
            int m = Integer.parseInt(info.nextToken());

            Set<String> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(br.readLine());
            }

            int count = 0;
            for (int i = 0; i < m; i++) {
                if (set.contains(br.readLine())) {
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