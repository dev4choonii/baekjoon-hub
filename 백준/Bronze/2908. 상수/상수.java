import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            // code ////////////////////////////////////////////////////////////////////////////////////////

            StringTokenizer numbers = new StringTokenizer(br.readLine());
            while (numbers.hasMoreTokens()) {
                int number1 = Integer.parseInt(sb.append(numbers.nextToken()).reverse().toString());
                sb.setLength(0);
                int number2 = Integer.parseInt(sb.append(numbers.nextToken()).reverse().toString());
                sb.setLength(0);

                sb.append(Math.max(number1, number2));
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////
            bw.write(sb.toString());
            bw.flush();
        }
    }
}
