import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            StringTokenizer info = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(info.nextToken());
            int x = Integer.parseInt(info.nextToken());

            StringTokenizer numbers = new StringTokenizer(br.readLine());
            while (numbers.hasMoreTokens()) {
                int number = Integer.parseInt(numbers.nextToken());
                if (x > number) {
                    sb.append(number).append(" ");
                }
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}