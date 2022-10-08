import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            int numberCount = 9;
            int max = 0;
            int index = 1;
            for (int i = 1; i <= numberCount; i++) {
                int number = Integer.parseInt(br.readLine());
                if (max < number) {
                    max = number;
                    index = i;
                }
            }

            sb.append(max).append("\n");
            sb.append(index);

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}