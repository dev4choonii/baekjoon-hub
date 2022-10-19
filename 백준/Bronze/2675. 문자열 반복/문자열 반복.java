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
                StringTokenizer info = new StringTokenizer(br.readLine());
                int r = Integer.parseInt(info.nextToken());
                String s = info.nextToken();

                for (int j = 0; j < s.length(); j++) {
                    sb.append(s.substring(j, j+1).repeat(r));
                }

                sb.append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}