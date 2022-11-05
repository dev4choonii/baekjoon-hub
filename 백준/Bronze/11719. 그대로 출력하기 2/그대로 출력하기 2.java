import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}